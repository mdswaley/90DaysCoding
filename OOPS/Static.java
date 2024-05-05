package OOPS;

public class Static {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.setId(124);
        em.setName("MD Swaley");
        em.companyName ="Microsoft";
        
        
        System.out.println(em.getId());
        System.out.println(em.getName());
        
        Employee em2 = new Employee(); 
        em2.companyName = "Wipro"; 
        System.out.println(em2.percentage(40, 30, 60));

        System.out.println(em2.companyName); 
        System.out.println(em.companyName); 

        Employee em3 = new Employee();
        System.out.println(em3.companyName);
        System.out.println(em3.percentage(80, 80, 99));
        // System.out.println(em2.percentage(0, 0, 0));
        

    }
}

class Employee{
    String name;
    int id;

    static String companyName;

    // static function
    static int percentage(int profit,int lose,int constant){
        return (profit+lose+constant)/3;
    }

    // setter for set name,id 
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }
}

