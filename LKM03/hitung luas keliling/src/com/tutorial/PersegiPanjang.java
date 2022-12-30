package com.tutorial;

public class PersegiPanjang {
    float panjang;
    float lebar;

    public void setPersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    void luas(){
        float luas = panjang *lebar;
        System.out.println("Luas Persegi Panjan:" + luas);

    }
    void keliling(){
        float kll =2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjng:" + kll);
    }
}
