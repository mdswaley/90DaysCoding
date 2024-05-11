package Recursion;

public class FriendsPairing {
    public static int friPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //choise
        //for sigle
        int fnm1 = friPairing(n-1);
        //for pairing
        int fnm2 = friPairing(n-2);
        
        //after pair with one if single he have choise n-1 * number of pairs. 
        int pairWays = (n-1) * fnm2;
        
        int totalWays = fnm1 + pairWays;
        return totalWays;

        //or
        // return friPairing(n-1)+(n-1) * friPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friPairing(4));
    }
}
