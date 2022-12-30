package com.tutorial;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        //membuat objek persegi
        Persegi persegi = new Persegi();
        persegi.setSisi(2);

        //membuat objek segitiga
        Segitiga Segitiga = new Segitiga();
        Segitiga.setSegitiga(18, 4);

        //membuat objek persegi panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPersegiPanjang(6, 4);

        //membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(4);

        //Memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("======PERSEGI======");
        persegi.luas();
        persegi.keliling();
        System.out.println("======SEGITIGA======");
        Segitiga.luas();
        Segitiga.keliling();
        System.out.println("======PERSEGI PANJANG======");
        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println("======LINGKARAN======");
        lingkaran.luas();
        lingkaran.keliling();
    }
}
