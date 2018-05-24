package com.alex.service.userinfo;

import com.alex.entity.userinfo.UserInfo;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service("writeToDBimpl")
public class writeToDBimpl implements com.alex.service.userinfo.writeToDB {
    @Autowired
    private com.alex.dao.userinfo.writeToDB writeToDB;
    @Override
    public void insert(UserInfo userInfo) {
        writeToDB.insert(userInfo);
    }

    @Override
    public void update(UserInfo userInfo) {
        writeToDB.update(userInfo);
    }

    @Override
    public List<UserInfo> select(long account) {
        List<UserInfo> userInfoList=writeToDB.select(account);
        return userInfoList;
    }

    @Override
    public UserInfo checkInfo(long account) {
        List<UserInfo> userInfoList=this.select(account);
        if(userInfoList.size()>0){
            UserInfo userInfo=userInfoList.get(0);
            return userInfo;
        }else {
            return null;
        }
    }

    @Override
    public UserInfo checkInfoByOpenId(String openId) {
        List<UserInfo> userInfoList=writeToDB.checkInfoByOpenId(openId);
        if(userInfoList.size()>0){
            UserInfo userInfo=userInfoList.get(0);
            return userInfo;
        }else {
            return null;
        }
    }

    @Override
    public UserInfo getInfo(String msg) {
        JSONObject jsonObject=JSONObject.parseObject(msg);
        long user_account=this.createAccount();
        UserInfo userInfo=new UserInfo(user_account,jsonObject.getString("openId"),null,jsonObject.getString("nickName"),jsonObject.getString("avatarUrl"),0,null,jsonObject.getInteger("gender"),jsonObject.getString("province"),jsonObject.getString("city"),jsonObject.getString("country"),jsonObject.getJSONObject("watermark").getLong("timestamp"),false,0,false);
        return userInfo;
    }

    @Override
    public UserInfo changeDB(UserInfo userInfo,String msg) {
        if(userInfo==null){
            userInfo=this.getInfo(msg);
            this.insert(userInfo);
        }else {
            return userInfo;
        }
        return userInfo;
    }

    @Override
    public long createAccount() {
        boolean ok=false;
        int user_account=0;
        while (!ok){
            long timeStamp = System.currentTimeMillis()/1000;
            Random rd = new Random(timeStamp);
            user_account=Math.abs(rd.nextInt());
            if(String.valueOf(user_account).length()<10||String.valueOf(user_account).length()>6){
                List<UserInfo> userInfoList= writeToDB.select(user_account);
                if(userInfoList.size()==0) {
                    ok = true;
                }
            }
        }

        return user_account;
    }
}
