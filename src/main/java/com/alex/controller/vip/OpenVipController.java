package com.alex.controller.vip;

import com.alex.entity.userinfo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OpenVipController {
    @Resource(name = "VipOpen")
    private com.alex.service.vip.openVip openVip;
    @RequestMapping(value = "/OpenVip",method = RequestMethod.POST)
    @ResponseBody
    public Object openVip(long account,int month){
        List<UserInfo> userInfoList= openVip.selectUser(account);
        UserInfo userInfo=userInfoList.get(0);
        userInfo=openVip.check(userInfo,month);
        openVip.openVip(userInfo);
        return userInfo;
    }

}
