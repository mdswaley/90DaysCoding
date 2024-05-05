package OOPS.PracticeQueOops;

public class AssignName {
    public static void main(String[] args) {

        // Find out the correct statement to assign name to object

        // Student s = new Student();
        // s.name="MDS";
        // System.out.println(s.name);
        Student.name= "msd";
        System.out.println(Student.name);
    }   
}

class Student{
     static String name; //if static directly access.

}
