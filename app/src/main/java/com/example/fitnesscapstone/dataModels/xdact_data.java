package com.example.fitnesscapstone.dataModels;

public class xdact_data {


    String x_name,x_intro;
    int img_id;

    public String getX_name() {
        return x_name;
    }

    public void setX_name(String x_name) {
        this.x_name = x_name;
    }

    public String getX_intro() {
        return x_intro;
    }

    public void setX_intro(String x_intro) {
        this.x_intro = x_intro;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public xdact_data(String x_name, String x_intro, int img_id) {
        this.x_name = x_name;
        this.x_intro = x_intro;
        this.img_id = img_id;
    }

    public xdact_data() {
    }
}
