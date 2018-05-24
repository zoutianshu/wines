package com.alex.service.finder;

import com.alex.entity.finder.FinderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("finder")
public class finderInfoimpl implements finderInfo {
    @Autowired
    private com.alex.dao.finder.finderInfo finderInfo;

    @Override
    public List<FinderInfo> selectFinder() {
        List<FinderInfo> finderInfoList=finderInfo.selectFinder();
        return finderInfoList;
    }
}
