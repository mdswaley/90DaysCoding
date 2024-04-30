package Function;

public class PrimeNoFun {
    private static boolean isPrime(int n){
        // corner case
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n-1; i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPrimeOtm(int n){
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void printAllPrimeRange(int n){
        
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        // System.out.println(isPrime(12));
        System.out.println(isPrimeOtm(12));

        printAllPrimeRange(10);

        
    }
}
