package com.alex.entity.share;

public class ShareInfo {
    private String id;
    private String image;
    public ShareInfo(){}
    public ShareInfo(String id,String image){
      this.id=id;
      this.image=image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public String getId() {
        return id;
    }
}
