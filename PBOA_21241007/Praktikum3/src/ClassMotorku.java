class MOTOR{
    String merk;
    int tahun;
    String nopolisi;
    String warna;

    public MOTOR(String merk, int tahun, String noPolisi,String warna) {
        this.merk = merk;
        this.tahun = tahun;
        this.nopolisi = noPolisi;
        this.warna = warna;
    }
    void showInfoMotor() {
        System.out.println("Merk :" + this.merk);
        System.out.println("Tahun :  "+ this.tahun);
        System.out.println("No Polisi : " + this.nopolisi);
        System.out.println("Warna : " + this.warna);
    }
}

public class KelasMotorku {
    public static void main(String[] args) {
        MOTOR motorku = new MOTOR("Honda GL Pro", 1997, "G 5879 BF", "Hitam");
        motorku.showInfoMotor();
    }
}
