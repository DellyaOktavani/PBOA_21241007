package PRAKTIKUM2;

public class TestMahasiswa {
   public static void main(String[]args){
    Mahasiswa MHS = new Mahasiswa();
    System.out.println("IDENTITAS AWAL : ");
    MHS.cetak();

    MHS.ubah("Rashford", 2020, "Manchester");
    System.out.println("\nIDENTITAS AKHIR : ");
    MHS.cetak();

    Mahasiwa mhsTI = new Mahasiswa ();
    System.out.println("\nIDENTITAS AWAL ");
    mhsTI.cetak();
    mhsTI.ubah("PUTRI", 2020, "Mataram");
    System.out.println("\nIDENTITAS AKHIR");
    mhsTI.cetak();

    Mahasiwa mhsTE = new Mahasiswa();
    System.out.println("\nIDENTITAS AWAL");
    mhsTE.cetak();
    mhsTE.ubah("DENISA", 2021, "Plampang");
    System.out.println("\nIDENTITAS AKHIR");
    mhsTE.cetak(); 


   }

}
