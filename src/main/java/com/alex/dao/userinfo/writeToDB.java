package com.alex.dao.userinfo;

import com.alex.entity.userinfo.UserInfo;

import java.util.List;

public interface writeToDB {
    public void insert(UserInfo userInfo);
    public void update(UserInfo userInfo);
    public List<UserInfo> select(long account);
    public List<UserInfo> checkInfoByOpenId(String openId);
}
