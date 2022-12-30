package com.tutorial;

public class Persegi extends BangunDatar {
    public float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    void luas(){
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    void keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }
    
}
