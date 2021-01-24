package com.example.fitnesscapstone.dataModels;

public class dis_data {

    String disname,dis_cure;

    public dis_data() {
    }

    public String getDisname() {
        return disname;
    }

    public void setDisname(String disname) {
        this.disname = disname;
    }

    public String getDis_cure() {
        return dis_cure;
    }

    public void setDis_cure(String dis_cure) {
        this.dis_cure = dis_cure;
    }

    public dis_data(String disname, String dis_cure) {
        this.disname = disname;
        this.dis_cure = dis_cure;
    }
}
