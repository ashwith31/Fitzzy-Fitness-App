package com.example.fitnesscapstone.dataModels;

public class viddata {

    String vidname,vidurl;
    int imageIg;

    public String getVidname() {
        return vidname;
    }

    public void setVidname(String vidname) {
        this.vidname = vidname;
    }

    public String getVidurl() {
        return vidurl;
    }

    public void setVidurl(String vidurl) {
        this.vidurl = vidurl;
    }

    public int getImageIg() {
        return imageIg;
    }

    public void setImageIg(int imageIg) {
        this.imageIg = imageIg;
    }

    public viddata(String vidname, String vidurl, int imageIg) {
        this.vidname = vidname;
        this.vidurl = vidurl;
        this.imageIg = imageIg;
    }

    public viddata() {
    }
}
