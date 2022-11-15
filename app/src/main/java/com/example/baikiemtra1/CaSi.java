package com.example.baikiemtra1;

public class CaSi {
    private String ten;
    private String ngheDanh;
    private String quocGia;
    private int hinhAnh;

    public CaSi(String ten, String ngheDanh, String quocGia, int hinhAnh) {
        this.ten = ten;
        this.ngheDanh = ngheDanh;
        this.quocGia = quocGia;
        this.hinhAnh = hinhAnh;
    }

    public CaSi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgheDanh() {
        return ngheDanh;
    }

    public void setNgheDanh(String ngheDanh) {
        this.ngheDanh = ngheDanh;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
