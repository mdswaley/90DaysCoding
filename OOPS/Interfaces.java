package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Babitaji bj = new Babitaji();
        bj.charecter();
    }
}

interface TarakMehta{
    void charecter();    
}

class Jethalal implements TarakMehta{
    public void charecter(){
        System.out.println("Best Comedian.");
    }
}

class Babitaji implements TarakMehta{
    public void charecter(){
        System.out.println("Beautiful Women.");
    }
}

class Tapu implements TarakMehta{
    public void charecter(){
        System.out.println("Handsome Men.");
    }
}