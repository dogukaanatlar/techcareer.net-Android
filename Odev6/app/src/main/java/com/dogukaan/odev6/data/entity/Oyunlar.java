package com.dogukaan.odev6.data.entity;

import java.io.Serializable;

public class Oyunlar implements Serializable {
    private int id;
    private String ad;
    private String resimAdi;
    private int yil;
    private double fiyat;
    private String yayinci;

    public Oyunlar(int id, String ad, String resimAdi, int yil, double fiyat, String yayinci) {
        this.id = id;
        this.ad = ad;
        this.resimAdi = resimAdi;
        this.yil = yil;
        this.fiyat = fiyat;
        this.yayinci = yayinci;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getResimAdi() {
        return resimAdi;
    }

    public void setResimAdi(String resimAdi) {
        this.resimAdi = resimAdi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getYayinci() {
        return yayinci;
    }

    public void setYayinci(String yayinci) {
        this.yayinci = yayinci;
    }
}
