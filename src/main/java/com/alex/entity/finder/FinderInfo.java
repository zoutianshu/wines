package com.alex.entity.finder;

public class FinderInfo {
    private String image;
    private String avatar;
    private String title;
    private String meta;
    private String nickname;
    private String method;
    private String url;
    public FinderInfo(){}
    public FinderInfo(String image,String avatar,String title,String meta,String nickname,String method,String url){
        this.avatar=avatar;
        this.image=image;
        this.meta=meta;
        this.method=method;
        this.nickname=nickname;
        this.title=title;
        this.url=url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getNickname() {
        return nickname;
    }

    public String getMethod() {
        return method;
    }

    public String getMeta() {
        return meta;
    }

    public String getImage() {
        return image;
    }

    public String getAvatar() {
        return avatar;
    }
}
