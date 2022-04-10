package com.learning;
// inheritance adalah hubungan is-a

//superclass, parent class.
class Hero{
    String name;
    //method
    void display(){
        System.out.println("Name : " + this.name);
    }
}

// subclass, child class.
class HeroStrength extends Hero{
}
class HeroIntelligent extends Hero{
}


public class Inheritance {
    public static void main(String[] args){
        Hero hero1 = new Hero();
        hero1.name = "gusion";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "lancelot";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "fanny";
        hero3.display();
        }
}