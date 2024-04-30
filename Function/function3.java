package Function;

import java.util.Scanner;

public class function3 {
    public static int calculateFactorial(int n){
        if (n<0) {
            System.out.println("invalid number");
            return 1;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        
        return fact;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("fact of a number: "+calculateFactorial(n));



    }
}
