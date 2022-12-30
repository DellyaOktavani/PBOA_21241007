class Mahasiswa {
    String nama;
    String NIM;
    String Jurusan;
    double IPK;
    int umur;

}

public class App {
    public static void main(String[] args) throws Exception {
        // object mahasiswa 1
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Ronaldinho";
        mhs.NIM = "2021001001";
        mhs.Jurusan = "PTI";
        mhs.IPK = 3.09;
        mhs.umur = 20;

        System.out.println("======================");
        System.out.println("objek Mahasiswa 1");
        System.out.println("======================");
        System.out.println("Nama : " + mhs.nama);
        System.out.println("NIM :" + mhs.NIM);
        System.out.println("Jurusan :" + mhs.Jurusan);
        System.out.println("IPK :" + mhs.IPK);
        System.out.println("umur : " + mhs.umur);

    }

}
