package com.alex.entity.help;

public class HelpInfo {
    private String title;
    private String msg;
    private String url;
    public HelpInfo(){}
    public HelpInfo(String title,String msg,String url){
        this.title=title;
        this.msg=msg;
        this.url=url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getMsg() {
        return msg;
    }
}
