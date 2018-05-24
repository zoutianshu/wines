package com.alex.service.userinfo;

import com.alex.entity.userinfo.UserInfo;

import java.util.List;

public interface writeToDB {
    public void insert(UserInfo userInfo);
    public void update(UserInfo userInfo);
    public List<UserInfo> select(long account);
    public UserInfo checkInfo(long account);
    public UserInfo checkInfoByOpenId(String openId);
    public UserInfo getInfo(String msg);
    public UserInfo changeDB(UserInfo userInfo,String msg);
    public long createAccount();
}
