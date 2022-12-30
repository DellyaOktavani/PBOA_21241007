public class Mahasiswa {
    public static void main(String[] args) throws Exception {

    }

    public String Nama;
    public int Angkatan;
    public String Asal;

    public Mahasiswa() {
        Nama = "jago";
        Angkatan = 2020;
        Asal = "Jember";

    }

    public void ubah(String nm, int ak, String as) {
        Nama = nm;
        Angkatan = ak;
        Asal = as;

    }

    public void cetak() {
        System.out.println("nama : " + Nama);
        System.out.println("angkatan :" + Angkatan);
        System.out.println("asal : " + Asal);
    }

}
