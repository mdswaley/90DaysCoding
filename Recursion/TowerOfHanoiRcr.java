package Recursion;

public class TowerOfHanoiRcr {
    public static void printTowerOfHanoi(int n,String srs,String helper,String dest){
        if (n == 1) {
            System.out.println("transfer disk "+n+" from "+srs+" to "+dest);
            return;
        }
        printTowerOfHanoi(n-1, srs, dest, helper);
        System.out.println("transfer disk "+n+" from "+srs+" to "+dest);
        printTowerOfHanoi(n-1, helper, srs, dest);

    }
    public static void main(String[] args) {
        int n = 3;
        printTowerOfHanoi(n, "S", "H", "D");

    }
    
}
