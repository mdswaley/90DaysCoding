package OOPS;

public class HirarcialConstructor {
    public static void main(String[] args) {
        Jadeja jr = new Jadeja();
        
    }
}

class Dhoni{
    Dhoni(){
        System.out.println("Best Captain.");
    }
} 
class Virat extends Dhoni{
    Virat(){
        System.out.println("Best Batter.");
    }

}

class Jadeja extends Virat{
    Jadeja(){
        System.out.println("Best Allrounder.");
    }
    
}

