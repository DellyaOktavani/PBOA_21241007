class MOTOR {
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    public MOTOR(String merk, int tahun, String noPolisi, String warna) {
        this.merk = merk;
        this.tahun = tahun;
        this.noPolisi = noPolisi;
        this.warna = warna;

    }

    void showInfoMotor() {
        System.out.println("Merk : " + this.merk);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("No Polisi : " + this.noPolisi);
        System.out.println("Warna : " + this.warna);
    }
}

public class kelasMotorku {
    public static void main(String[] args) throws Exception {
        MOTOR motorku = new MOTOR("Honda GL Pro", 1997, "G 5879 BF", "Hitam");
        motorku.showInfoMotor();
    }
}
