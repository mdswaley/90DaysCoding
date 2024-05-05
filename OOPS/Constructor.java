package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1("MD Swaley");
        System.out.println(s1.name);  
        s1.marks[0] = 60;
        s1.marks[1] = 70;
        s1.marks[2] = 100;
        s1.age = 22;
        // copy constructor
        Student1 s2 = new Student1(s1);

        s2.name = "MD";
        
        s1.age = 40;//but for single value after copy it is not affect orignal
        s1.marks[2] = 80;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        
        // System.out.println("s2:-"+s2.age);
        // System.out.println("s1:-"+s1.age);
    }
}

class Student1{
    String name;
    int age;
    int marks[] = new int[3];

    // Constructor Overloading
    // Non-parameterise constructor
    Student1(){
        System.out.println("Constructor Call.....");
    }

    // Parameterise constructor.
    Student1(String name){
        this.name = name;
    }
    Student1(int age){
        this.age = age;
    }

    // copy constructor (shallow copy)
    // Student1(Student1 s1){
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    Student1(Student1 s1){
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
