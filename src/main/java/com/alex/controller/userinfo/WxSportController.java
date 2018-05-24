package com.alex.controller.userinfo;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class WxSportController {
    @Resource(name = "wxLoginimpl")
    private com.alex.service.userinfo.wxLogin wxLoginimpl;
    @RequestMapping(value = "/getWxSport",method = RequestMethod.POST)
    @ResponseBody
    public Object getWxSport(String code,String iv,String encryptedData){
        String sessionMsg=wxLoginimpl.getWxSession(code);
        String key=JSONObject.parseObject(sessionMsg).getString("session_key");
        String decipherMsg=wxLoginimpl.deciphering(key,iv,encryptedData);
        return decipherMsg;
    }
}
