package Function;

public class IsEvenFun {
    public static boolean isEven(int n){
        if (n%2==0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 1;
        if (isEven(n)) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

    }
}
