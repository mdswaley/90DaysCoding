package OOPS;

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.fun(); //child class method override parent class method  
    }
}
class A{
    void fun(){
        System.out.println("Hello");
    }
}
class B extends A{
    void fun(){
        super.fun(); //first call parent fun() the child class fun(). bcz of super keyword it is use to call parent method,propertises and constructor al well
        System.out.println("World");
    }
}
