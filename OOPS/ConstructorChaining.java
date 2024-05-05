package OOPS;

public class ConstructorChaining {
    public static void main(String[] args) {
        Temp t = new Temp();
    }
}
class Temp{
    Temp(){
        this(5);
        System.out.println("default const...");
    }
    Temp(int a){
        this(5, 1);
        System.out.println("2nd const value:-"+a);
    }
    Temp(int a,int b){
        System.out.println("3rd const value a:- "+a+", b:- "+b);
    }
}
