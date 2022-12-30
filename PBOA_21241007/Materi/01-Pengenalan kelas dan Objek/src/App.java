class Mahasiswa{
    String nama;
    String Nim;
    String jurusan;
    double Ipk;
    int umur;
}

public class App {
    private static final int _19 = 19;

    public static void main(String[] args) throws Exception {
       //object Mahasiswa 1 
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Dellya Ade Oktavani";
        mhs.Nim = "21241007";
        mhs.jurusan = "PTI";
        mhs.Ipk = 3.64;
        mhs.umur = _19;

        System.out.println("======================");
        System.err.println("Objek Mahasiswa 1");
        System.out.println("======================");
        System.out.println("nama    :" + mhs.nama);
        System.out.println("Nim     :" + mhs.Nim);
        System.out.println("jurusan :" + mhs.jurusan);
        System.out.println("Ipk     :" + mhs.Ipk);
        System.out.println("umur    :" + mhs.umur);
        

    }
}