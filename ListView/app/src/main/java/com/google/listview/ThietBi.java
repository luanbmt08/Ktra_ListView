package com.google.listview;

public class ThietBi {
    private String tenmon;
    private String mota;
    private String gia;
    private int hinh;

    public ThietBi(String tenmon, String mota, String gia, int hinh) {
        this.tenmon = tenmon;
        this.mota = mota;
        this.gia = gia;
        this.hinh = hinh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
