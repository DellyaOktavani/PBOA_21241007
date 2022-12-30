class Mahasiswa{
   String nama = "otong";
   String NIM;

    Mahasiswa(String nama, String NIM){
    this.nama = nama;
    this.NIM = NIM;

   }
   //method tanpa parameter dan tanpa return
   void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Nama : " + this.NIM);
   }

   //method tanpa return dengan parameter
   void ubahNama(String nama){
    this.nama = nama;
   }
     //method dengan rutern, tanpa parameter
     String getNama(){
        return this.nama;

    }
    String getNIM(){
        return this.NIM;

    }
    //method dengan return, dengan parameter
    String kenalan(String prodi){
        return "Hai, nama saya" + this.nama + "Nim saya" + this.NIM + "Saya dari prodi" + prodi;

    }

}



public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("po", " 202020 ");

        mahasiswa1.show();
        mahasiswa1.ubahNama(" Umur ");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        
        String pesan = mahasiswa1.kenalan(" PTI ");
        System.out.println(pesan);
    }
  
}
