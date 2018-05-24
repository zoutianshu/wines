package com.alex.service.userinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service("wxLoginimpl")
public class wxLoginimpl implements wxLogin{
    @Resource(name = "decipherimpl")
    private com.alex.service.deciphering.deciphering decipherimpl;
    @Override
    public String getWxSession(String code) {
        String requestPathUrl="https://api.weixin.qq.com/sns/jscode2session?appid=wx636bcc58a139e2df&secret=cc0486e1f6f252feb14898082ef237ce&js_code="+code+"&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> result = restTemplate.getForEntity(requestPathUrl,String.class);
        String resultMsg=result.getBody();
        return resultMsg;
    }

    @Override
    public String deciphering(String key, String iv, String encryptedData) {
        key=key.replaceAll("( )","+");
        byte[] realKey=decipherimpl.BASE64Decoder(key);
        iv=iv.replaceAll("( )","+");
        byte[] realIv=decipherimpl.BASE64Decoder(iv);
        encryptedData=encryptedData.replaceAll("( )","+");
        byte[] realEncryptedData=decipherimpl.BASE64Decoder(encryptedData);
        String data=decipherimpl.AES_128_CBC_Decipher(realKey,realIv,realEncryptedData);
        return data;
    }
}
