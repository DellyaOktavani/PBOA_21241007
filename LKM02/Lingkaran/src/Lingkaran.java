public class Lingkaran {
    private static final double Phi = 0;
    private double phi;
    private double jari;
    public Lingkaran (double phi, double jari){
        this.phi = phi;
        this.jari = jari;

    }
    public static double getPhi(){
        return Phi;
    }
    public void setPhi(double phi){
        this.phi = phi;
    }
    public double getJari(){
        return jari;
    }
    public void SetJari(double jari){
        this.jari = jari;
    }
    public double hitungKeliling(){
        return (phi * jari * jari);
    }
    public double hitungLuas(){
        return (2 * phi * jari);
    }
    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran(3.14, 10);
        System.out.println("Phi Lingkaran = " + Lingkaran.getPhi());
        System.out.println("Jari - jari = " + lingkaran.getJari());
        System.out.println("Luas Lingkaran = " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran = " + lingkaran.hitungKeliling());

    }
}
