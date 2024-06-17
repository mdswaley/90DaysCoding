package Strings;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ;
        System.out.println("Enter any String: ");
        s=sc.nextLine();
        String ss=s.replace("e", "i");
        System.out.println(ss);
    }
}
