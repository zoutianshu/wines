package com.alex.service.share;

import com.alex.entity.share.ShareInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("share")
public class shareInfoimpl implements shareInfo{
    @Autowired
    private com.alex.dao.share.shareInfo shareInfo;
    @Override
    public List<ShareInfo> selectShare() {
       List<ShareInfo> shareInfoList=shareInfo.selectShare();
        return shareInfoList;
    }
}
