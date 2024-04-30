package Function;

import java.util.Scanner;

public class PalindromNumFun {
    public static boolean isPalindrom(int n){
        int newNum = n;
        int rev = 0;
        while (newNum>0) {
            int rem = newNum%10;
            rev = rev * 10 + rem;
            newNum = newNum/10;
        }
        if (n == rev) {
            return true;
        }
            
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrom(n)) {
            System.out.println("Palindrom Number.");
        }else{
            System.out.println("Not a Palindrom Number.");
        }

    }
}
