package com.alex.service.userinfo;

public interface wxLogin {
    public String getWxSession(String code);
    public String deciphering(String key,String iv,String encryptedData);
}
