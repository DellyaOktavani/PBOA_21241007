package PRAKTIKUM3;

public class Mobil extends Kendaraan {
    //overriding method
    @Override
    void bergerak(){
        System.out.println("Mobil Bergerak!");
    }
    
    //main class
    public static void main(String[] args) {
        //membuat objek mobil
        Mobil car = new Mobil();

        //objek car menggunakan method bergerak()
        car.bergerak();
    }
}