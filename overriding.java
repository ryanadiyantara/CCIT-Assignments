package com.learning;

class Hero{
    String name;
    //method
    void display(){
        System.out.println("Name : " + this.name);
    }
}

class HeroStrength extends Hero{
    double DefensePower;
    //overriding method
    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Defense Power : " + this.DefensePower);
    }
}

public class overriding {
    public static void main(String[] args){
        Hero hero1 = new Hero();
        hero1.name = "gusion";
        // hero1.DefemsePower = gapunya;
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "lancelot";
        hero2.DefensePower = 100;
        hero2.display();

        }
}