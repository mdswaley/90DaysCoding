package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();

        Hourse1 h2 = new Hourse1();
        h2.eat();
        h2.walk();
        // 
        System.out.println(h2.color);
        h2.changeColor();
        System.out.println(h2.color);
    }
}

abstract class Animal1{
    String color;
    Animal1(){
        color = "brown";
    }
    void eat(){
        System.out.println("eat anything...");
    }

    abstract void walk();
}

class Hourse1 extends Animal1{

    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 4 legs.");
    }
}

class Chicken extends Animal1{
    void changeColor(){
        color = "red";
    }
    void walk(){
        System.out.println("walks on 2 legs.");
    }
}
