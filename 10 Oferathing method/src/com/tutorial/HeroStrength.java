package com.tutorial;

class HeroStrength extends Hero {

    //atribut
    double defencePwer;

    //method overriding
    void display(){
        System.out.println("Hero Strength");
        System.out.println("Nama Hero : " + this.name);
        System.out.println("Defance Power : " + this.defencePwer);
    }
}