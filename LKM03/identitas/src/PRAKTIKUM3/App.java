package PRAKTIKUM3;

class identitas {
    private String universsitas = "Universitas Pendidikan Mandalika ";
    private String jurusan = "Pendidikan Teknologi Informasi";
    private String name;
    private String nim;

    //konstruktor
    public identitas(String nama, String nim){
        this.name = nama;
        this.nim = nim;
    }

    //method
    public void info(){
        System.out.println("Perguruan Tinggi : "+universsitas);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Nama : "+name);
        System.out.println("Nim : "+nim);
    }
}
//klass extends
class keterangan extends identitas {
    protected String angkatan;
    protected String alamat;

    //konstruktor
    public keterangan(String nama, String nim, String angkatan, String alamat){
        super(nama, nim);
        this.angkatan = angkatan;
        this.alamat = alamat;
    }

    //method
    public void info(){
        super.info();
        System.out.println("Angkatan : "+angkatan);
        System.out.println("Alamat : "+alamat);
    }
}
//main class 
class ConstruktorSuperKlass {
    public static void main(String[] args) throws Exception {
        keterangan mahasiswa = new keterangan("LILIS", "21241033", "Tahun 2021", "Selagalas");
        mahasiswa.info();
    }
}
