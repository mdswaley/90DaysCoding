package Recursion;

public class StackHeightLogn {
    public static int printStackHgtLognI(int x,int n){
        if (x == 0) {
            return 0;
        }else if(n == 0){
            return 1;
        }
        // if n is even number
        if(n%2 == 0){
            return printStackHgtLognI(x, n/2) * printStackHgtLognI(x, n/2);
        }else{
            return printStackHgtLognI(x, n/2) * printStackHgtLognI(x, n/2) * x;
        }

    }
    public static void main(String[] args) {
        int x = 2;
        int n = 6;
        int ans = printStackHgtLognI(x, n);
        System.out.println(ans);
    }
}
