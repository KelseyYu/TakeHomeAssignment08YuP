package com.example.mac.takehomeassignment08_yup;

/**
 * Created by mac on 2018/4/3.
 */

public class Cuisine {
    public int name;
    public int photoId;
    public boolean isSpicy;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public Cuisine(int name, int photoId, boolean isSpicy) {
        this.name = name;
        this.photoId = photoId;
        this.isSpicy = isSpicy;


    }
}
