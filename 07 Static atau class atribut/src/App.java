class Display{
    private String name;
    static String type = "layar";

    Display (String name){
        this.name = name;
    }

    void show(){
        System.out.println("Nama Display : " + this.name);
    }
    
}
public class App {
    public static void main(String[] args) throws Exception {
        //instasiasi atau penciptaan objek
        Display tampil1 = new Display("monitor");
        Display tampil2 = new Display("LCD");
        //tampil.show()

        //menampil static atau class atribut
        System.out.println("\nMenampilkan Static Atribur");
        System.out.println(tampil1.type);
        System.out.println(tampil2.type);
        System.out.println(Display.type);
    }
}
