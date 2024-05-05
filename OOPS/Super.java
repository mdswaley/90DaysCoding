package OOPS;

public class Super {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        System.out.println(s.ratting);
    }
}

class AC{
    int ratting;
    AC(){
        System.out.println("AC constructor is call....");
    }
}
class Samsung extends AC{
    Samsung(){
        super();//if we not write by default java always take parent constructor first
        super.ratting = 4;
        System.out.println("Samsung constructor is call....");
    }
}