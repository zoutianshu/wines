package com.alex.controller.help;

import com.alex.entity.help.HelpInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HelpController {
    @Resource(name = "selectHelpInfoimpl")
    private com.alex.service.help.selectHelpInfo helpInfoImpl;
    @RequestMapping(value = "/selectHelpInfo",method = RequestMethod.GET)
    @ResponseBody
    public Object selectHelpInfo(){
        System.out.println(1);
        List<HelpInfo> helpInfoList=helpInfoImpl.SelectAll();
        return helpInfoList;
    }
}
