package OOPS;

public class Inheritance {
    public static void main(String[] args) {

        // single level inheritance.
        // Fish f = new Fish();
        // f.setSkin("red");
        // f.setFins(4);

        // f.eat();
        // f.breath();
        // System.out.println("fins:-"+f.getFins());
        // System.out.println("skin color:-"+f.getSkin());
        
        
        // muti level inheritance
        // Dog bob = new Dog();
        // bob.eat();
        // bob.breath();
        // bob.breed = "German Shepherd";
        // bob.legs = 4;
        // System.out.println("Dog type:-"+bob.breed);
        // System.out.println("Having:-"+bob.legs+" legs");


        // Hierarchial inheritance
        Fish1 f1 = new Fish1();
        f1.eat();
        f1.breath();
        f1.swim();
        System.out.println();
        Mammal1 m1 = new Mammal1();
        m1.eat();
        m1.breath();
        m1.walk();
        
    }
}

// single level inheritance.
// base class or parent class
class Animal{
    String skinColor;

    void eat(){
        System.out.println("animal can eat");
    }

    void breath(){
        System.out.println("animal can breath");
    }
}
// derive class or child class
class Fish extends Animal{
    int fins;

    void setFins(int fins){
        this.fins = fins;
    }
    int getFins(){
        return this.fins;
    }

    void setSkin(String color){
        this.skinColor = color;
    }
    String getSkin(){
        return this.skinColor;
    }
}


// muti level inheritance
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed; //breed means which type (nasl). 
}

// Hierarchial inheritance

class Birds extends Animal{
    void fly(){
        System.out.println("Fly....");
    }
} 
class Fish1 extends Animal{
    void swim(){
        System.out.println("Swim....");
    }
}
class Mammal1 extends Animal{
    void walk(){
        System.out.println("Walk....");
    }
}

