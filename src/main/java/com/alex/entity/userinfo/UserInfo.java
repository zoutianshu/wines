package com.alex.entity.userinfo;


public class UserInfo {
     private long user_account;
     private String user_id;
     private String user_unionid;
     private String user_nickName;
     private String user_avatar;
     private int user_phoneNumber;
     private String user_signature;
     private int user_gender;
     private String user_province;
     private String user_city;
     private String user_country;
     private long last_login;
     private boolean isVip;
     private long vip_time;
     private boolean real_name;
     public UserInfo(){}
     public UserInfo(long user_account,String user_id,String user_unionid,String user_nickName,String user_avatar,int user_phoneNumber,String user_signature,int user_gender,String user_province,String user_city,String user_country,long last_login,boolean isVip,long vip_time,boolean real_name){
     this.isVip=isVip;
     this.last_login=last_login;
     this.user_city=user_city;
     this.user_country=user_country;
     this.user_avatar=user_avatar;
     this.user_phoneNumber=user_phoneNumber;
     this.user_signature=user_signature;
     this.user_gender=user_gender;
     this.user_id=user_id;
     this.user_nickName=user_nickName;
     this.user_province=user_province;
     this.vip_time=vip_time;
     this.user_account=user_account;
     this.user_unionid=user_unionid;
     this.real_name=real_name;
     }

    public void setUser_account(long user_account) {
        this.user_account = user_account;
    }

    public void setUser_unionid(String user_unionid) {
        this.user_unionid = user_unionid;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public void setLast_login(long last_login) {
        this.last_login = last_login;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public void setUser_country(String user_country) {
        this.user_country = user_country;
    }

    public void setUser_gender(int user_gender) {
        this.user_gender = user_gender;
    }

    public void setUser_nickName(String user_nickName) {
        this.user_nickName = user_nickName;
    }

    public void setUser_province(String user_province) {
        this.user_province = user_province;
    }

    public void setVip_time(long vip_time) {
        this.vip_time = vip_time;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public void setUser_phoneNumber(int user_phoneNumber) {
        this.user_phoneNumber = user_phoneNumber;
    }

    public void setUser_signature(String user_signature) {
        this.user_signature = user_signature;
    }

    public void setReal_name(boolean real_name) {
        this.real_name = real_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public long getLast_login() {
        return last_login;
    }

    public int getUser_gender() {
        return user_gender;
    }

    public long getVip_time() {
        return vip_time;
    }

    public String getUser_city() {
        return user_city;
    }

    public String getUser_country() {
        return user_country;
    }

    public String getUser_nickName() {
        return user_nickName;
    }

    public String getUser_province() {
        return user_province;
    }

    public boolean isVip() {
        return isVip;
    }

    public int getUser_phoneNumber() {
        return user_phoneNumber;
    }

    public String getUser_signature() {
        return user_signature;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public long getUser_account() {
        return user_account;
    }

    public String getUser_unionid() {
        return user_unionid;
    }

    public boolean isReal_name() {
        return real_name;
    }
}
