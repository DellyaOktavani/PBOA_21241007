package PRAKTIKUM2;

public class Mahasiswa {
    public String nama;
    public int angkatan;
    public String asal;

public Mahasiswa(){
    nama = "jago";
    angkatan = 2020;
    asal = "jemer";
}
public void ubah(String nm, int ak, String as){
    nama = nm;
    angkatan = ak;
    asal = as;
}
public void cetak(){
    System.out.println("nama : "+nama);
    System.out.println("angkatan : "+angkatan);
    System.out.println("asal :"+asal);
}
}
