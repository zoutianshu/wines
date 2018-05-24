package com.alex.controller.finder;

import com.alex.entity.finder.FinderInfo;
import com.alex.entity.help.HelpInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FinderController {
    @Resource(name = "finder")
    private com.alex.service.finder.finderInfo finderInfo;
    @RequestMapping(value = "/selectFinder",method = RequestMethod.GET)
    @ResponseBody
    public Object selectHelpInfo(){
        List<FinderInfo> finderInfoList=finderInfo.selectFinder();
        return finderInfoList;
    }
}
