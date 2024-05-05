package OOPS;

public class MutipleInterface {
    public static void main(String[] args) {
        Dhoni d = new Dhoni();
        d.bestCaptain();
        d.bestWicketKeeper();
    }
}
interface Captain {
     boolean isGood = true;
    void bestCaptain();
}

interface Wicketkeeper{
     boolean isGood = true;
    void bestWicketKeeper();
}

class Dhoni implements Captain,Wicketkeeper{
    
    public void bestCaptain(){
        System.out.println("is he best captain:-"+Captain.isGood);
    }
    public void bestWicketKeeper(){
        System.out.println("is he best wicket keeper:-"+Wicketkeeper.isGood);
    }
}
