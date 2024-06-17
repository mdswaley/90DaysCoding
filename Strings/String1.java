package Strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        //String Declaration
        // String name = "Tony";
        // String fullName = "MD Swaley";

        //Take user input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("My name is: "+name);

        //concatination
        String frt = "MD";
        String last = "Swaley";
        String full = frt +" "+ last;
        System.out.println(full);

        //if you want to find length 
        System.out.println(full.length());

        //find the char 
        for(int i=0;i<full.length();i++){
            System.out.println(full.charAt(i));
        }
    }
}
