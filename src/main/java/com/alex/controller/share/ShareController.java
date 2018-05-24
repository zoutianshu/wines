package com.alex.controller.share;

import com.alex.entity.share.ShareInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ShareController {
    @Resource(name = "share")
    private com.alex.service.share.shareInfo shareInfo;
    @RequestMapping(value = "/selectShare",method = RequestMethod.GET)
    @ResponseBody
    public Object selectShareInfo(){
        List<ShareInfo> shareInfoList= shareInfo.selectShare();
        return shareInfoList;
    }
}
