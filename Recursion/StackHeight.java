package Recursion;

public class StackHeight {
    public static int printStackHgt(int x, int n){
        if (x == 0 ) {
            return 1;
        }else if(n==0){
            return 1;
        }
        int cal_pow_nm1 = printStackHgt(x, n-1);
        
        int cal_pow = x * cal_pow_nm1;
        return cal_pow;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = printStackHgt(x, n);
        System.out.println(ans);
        //stack height is n ~~(nearly equal to)lavel of stack
        //bcz lavel = 6 means how many time call our recursion function in stack.
        //and n = 5 means number of time call function.

    }
}
