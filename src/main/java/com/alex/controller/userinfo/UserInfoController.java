package com.alex.controller.userinfo;


import com.alex.entity.userinfo.UserInfo;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserInfoController {
    @Resource(name = "writeToDBimpl")
    private com.alex.service.userinfo.writeToDB writeToDBimpl;
    @Resource(name = "wxLoginimpl")
    private com.alex.service.userinfo.wxLogin wxLoginimpl;
    @RequestMapping(value = "/UserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object userinfo(String code,String iv,String encryptedData,long account){
        UserInfo userInfo=null;
        if(account!=0){
            userInfo=writeToDBimpl.checkInfo(account);
        }else{
            String sessionMsg=wxLoginimpl.getWxSession(code);
            String key=JSONObject.parseObject(sessionMsg).getString("session_key");
            String openId=JSONObject.parseObject(sessionMsg).getString("openid");
            String decipherMsg=wxLoginimpl.deciphering(key,iv,encryptedData);
            userInfo=writeToDBimpl.checkInfoByOpenId(openId);
            userInfo=writeToDBimpl.changeDB(userInfo,decipherMsg);
        }

        return userInfo;
    }
    @RequestMapping(value = "/CheckUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object checkUserInfo(long account){
        UserInfo userInfo=writeToDBimpl.checkInfo(account);
        userInfo.setLast_login(System.currentTimeMillis()/1000);
        writeToDBimpl.update(userInfo);
        return userInfo;
        }
    @RequestMapping(value = "/ChangeUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object changeUserInfo(@RequestBody UserInfo userInfo){
        writeToDBimpl.update(userInfo);
        return userInfo;
    }
}
