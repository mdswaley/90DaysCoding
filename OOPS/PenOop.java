package OOPS;

public class PenOop {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // create a pen object , Pen() is a constructor
        p1.setColor("Blue");// when ever you use pen class prop or method p1 using (.) dot you can use.
        System.out.println(p1.color);

        p1.setTip(2);
        System.out.println(p1.tip);

        p1.color = "yello"; // it is not give any error bcz it access modifier is default type so that we can access within class as well as within same package
        System.out.println(p1.color);


        BankAccount ba = new BankAccount();
        ba.userName = "MD Swaley";
        // ba.password ="123"; not accessible bcz it is in another class

        ba.setPassword("1234"); // but method is accessible bcz it is public . so we can only set password

        Student s1 = new Student();
        s1.setName("MD");
        s1.setAge(20);

        
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        

    }
}

// Build a new Product Pen
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

// Back Account for better understand access modifier
class BankAccount{
    String userName;
    private String password; // only accessible this class.

    public void setPassword(String psw){
        password = psw;
    }
}

// Student information
class Student{
    private String name;
    private int age;
    float percentage;

    void calPercentage(int phy,int math,int chem){
        percentage = (phy + math + chem)/3;
    }

    // Getter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    // Setter 
    // this:- it also work for reference pass in variable
    public void setName(String name){
        this.name = name; // this.name is object variable and name in right side is parameter name where we pass value.
    }
    public void setAge(int age){
        this.age = age;
    }
}




