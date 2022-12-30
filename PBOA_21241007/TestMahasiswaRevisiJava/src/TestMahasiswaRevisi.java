package TestMahasiswaRevisi;

public class TestMahasiswaRevisi {
    public static void main(String[] args)  {
        Mahasiswa mhsTI = new Mahasiswa();
        System.out.println("IDENTITAS AWAL :");
        mhsTI.cetak();

        mhsTI.ubah("Tsuna", 2020, "jepang");
        System.out.println("\nIDENTITAS AKHIR : ");
        mhsTI.cetak();

        Mahasiswa mhsTE = new Mahasiswa();
        System.out.println("\nIDENTITAS AWAL :");
        mhsTE.cetak();

        mhsTE.ubah("Tsuna", 2020, "Jepang");
        System.out.println("\nIDENTITAS AKHIR : ");
        mhsTI.cetak();
    }
}