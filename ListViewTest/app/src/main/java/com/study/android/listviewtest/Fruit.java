package com.study.android.listviewtest;

/**
 * Created by Administrator on 2016/11/7.
 */

public class Fruit {

    private String name;
    private int imagedId;

    public Fruit(String name, int imagedId) {
        this.name = name;
        this.imagedId = imagedId;
    }

    public String getName() {
        return name;
    }

    public int getImagedId() {
        return imagedId;
    }
}
