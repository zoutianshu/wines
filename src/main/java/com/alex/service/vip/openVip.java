package com.alex.service.vip;

import com.alex.entity.userinfo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface openVip {
    public List<UserInfo> selectUser(long account);
    public void openVip(UserInfo userInfo);
    public UserInfo check (UserInfo userInfo,int month);
}
