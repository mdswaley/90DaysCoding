package OOPS.PracticeQueOops;

public class Snippet {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print(); //derive car call..  bcz of function overriding car is inherite Vehicle so print is always call child class if same name and parameter

        Vehicle obj2 = new Vehicle();
        obj2.print(); //base vehicle call..
    }
}

class Vehicle{
    void print(){
        System.out.println("base vehicle call..");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("derive car call..");
    }
}
