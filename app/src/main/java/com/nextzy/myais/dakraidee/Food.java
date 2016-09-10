package com.nextzy.myais.dakraidee;

/**
 * Created by Akexorcist on 9/10/2016 AD.
 */

public class Food {
    String name;
    int imageResId;

    public Food() {
    }

    public Food(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
