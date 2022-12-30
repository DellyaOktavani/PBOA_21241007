class Player { // default, class dapat diakses (ditulis dan dibaca) oleh class lain
    String nama;
    private int health; // private, hanya bisa diakses (ditulis dan dibaca) oleh class asalnya saja

    Player(String nama, int health) {
        this.nama = nama;
        this.health = health;
    }

    void display() {
        System.out.println("Nama Player : " + this.nama);
        System.out.println("HP Player : " + this.health);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Fajar", 100);

        player1.nama = "Dalsim";
        player1.display();

    }
}
