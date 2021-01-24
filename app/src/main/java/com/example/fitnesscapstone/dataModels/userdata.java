package com.example.fitnesscapstone.dataModels;

public class userdata {

    String name,email,age,imageurl;

    public userdata(String name, String email, String age,String imageurl) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.imageurl=imageurl;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public userdata() {
    }
}
