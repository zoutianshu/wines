package com.alex.service.vip;

import com.alex.entity.userinfo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("VipOpen")
public class openVipimpl implements openVip{
    @Autowired
    private com.alex.dao.vip.openVip openVip;

    @Override
    public List<UserInfo> selectUser(long account) {
        List<UserInfo> userInfoList=openVip.selectUser(account);
        return userInfoList;
    }

    @Override
    public void openVip(UserInfo userInfo) {
        openVip.openVip(userInfo);
    }

    @Override
    public UserInfo check(UserInfo userInfo,int month) {
        long newTime=0;
        if(userInfo.isVip()&&userInfo.getVip_time()>=System.currentTimeMillis()/1000){
            //用户有会员且会员未到期
            newTime=userInfo.getVip_time()+month*2592000;
            userInfo.setVip_time(newTime);
        }else {
            newTime =System.currentTimeMillis()/1000+month*2592000;
            userInfo.setVip(true);
            userInfo.setVip_time(newTime);
        }
        return userInfo;
    }
}
