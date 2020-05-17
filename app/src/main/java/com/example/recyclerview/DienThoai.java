package com.example.recyclerview;

public class DienThoai {
    public int imgHinh;
    public String name;

    public DienThoai(int imgHinh, String name) {
        this.imgHinh = imgHinh;
        this.name = name;
    }

    public int getImgHinh() {
        return imgHinh;
    }

    public void setImgHinh(int imgHinh) {
        this.imgHinh = imgHinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
