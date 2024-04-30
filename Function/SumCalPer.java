package Function;

import java.util.Scanner;

public class SumCalPer {
    public static void printSum(int a,int b){
        int res = a+b;
        System.out.println("sum : "+ res);
    }

    public static int printSumRet(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // SumCalPer s = new SumCalPer();
        // s.printSum(a, b);
        // printSum(a,b);
        int sum = printSumRet(a, b);
        System.out.println(sum);
    }
}
