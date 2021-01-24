package com.example.fitnesscapstone.dataModels;

public class doc_data {

    String name,address,no,service;

    public doc_data(String name, String address, String no, String service) {
        this.name = name;
        this.address = address;
        this.no = no;
        this.service = service;
    }

    public doc_data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
