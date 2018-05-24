package com.alex.service.help;

import com.alex.entity.help.HelpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selectHelpInfoimpl")
public class selectHelpInfoimpl implements selectHelpInfo{
    @Autowired
    private com.alex.dao.help.selectHelpInfo selectHelpInfo;

    @Override
    public List<HelpInfo> SelectAll() {
        List<HelpInfo> helpInfoList=selectHelpInfo.SelectAll();
        return helpInfoList;
    }

}
