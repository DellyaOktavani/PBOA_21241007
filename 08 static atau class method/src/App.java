import java.util.ArrayList;

class Player{
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player (String nama){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add (this.name);

    }

    void show(){
        System.out.println("Nama Player : " + this.name);
    }
    //membuat static method
    static void showNumberOfPlayer(){
        System.out.println("Number of Player : " + Player.numberOfPlayer);
    }
    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
