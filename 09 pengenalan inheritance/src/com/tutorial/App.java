package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        //instansiasi atau penciptaan objek 
        Hero hero1 = new Hero();
        hero1.name = "Iron man";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Spiderman";
        hero2.display();

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "Doraemon";
        hero3.display();
    }
}
