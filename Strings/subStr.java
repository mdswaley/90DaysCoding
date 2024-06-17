package Strings;

import java.util.Scanner;

public class subStr {
    public static void main(String[] args) {
        String s = "MD Swaley";
        //subString(starting index,ending index) value then print the string but in ending value it is not inclusive.
        System.out.println(s.substring(0,2));
        System.out.println(s.substring(3));
        System.out.println(s.replace("M", "S"));
    }
}
