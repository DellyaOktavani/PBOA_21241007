package PRAKTIKUM2;

public class TestMahasiswa {
    public static void main(String[] args)  {
        Mahasiswa MHS = new Mahasiswa();
        System.out.println("IDENTITAS AWAL :");
        MHS.cetak();

        MHS.ubah("Rashford", 2020, "Manchester");
        System.out.println("\nIDENTITAS AKHIR : ");
        MHS.cetak();
    }
}