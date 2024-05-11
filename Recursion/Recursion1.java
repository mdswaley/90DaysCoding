package Recursion;

public class Recursion1 {
    public static void printRecur(int n){
        if(n==0){//3rd step check cond if false then out of statement and print n value then decrese by 1 n value.
            return;
        }
        System.out.println(n);//4th step
        printRecur(n-1);//5th step n-- means decresing
    }
    public static void printSumNum(int m,int i,int sum){
        
        if(m == i){
            System.out.println(sum);
            return;
        }
        sum = sum + m;
        printSumNum(m+1,i,sum);
        System.out.println(m);//5,4,3,2,1

    }
    public static int printFact(int x){
        if(x==0 || x==1){
            return 1;
        }
            int fact_nm1 = printFact(x-1);
            System.out.println("fact of x-1: "+fact_nm1);
            //1st x = 2 and fact_nm1 = 1 res = 2*1
            int fact_cal = x*fact_nm1;
            System.out.println("result: "+fact_cal+"\n");
            return fact_cal;
    }
    //another way
    public static int printAnFact(int x){
        if (x>=1) {
            return x*printAnFact(x-1);
        }else{
            return 1;
        }
    }
    //fibonacci seriese
    public static void printFibo(int first_term,int second_term,int y){
        if (y == 0) {
            return;
        }
        int next_term = first_term + second_term;
        System.out.println(next_term);
        //in there we find next term so for second next term out first is second and second is next term so that we calcuate other terms and y-1 mean after cal next term our term is decrese by 1
        printFibo(second_term, next_term, y-1);
        System.out.println(y);
        System.out.println("hello");//y = 7-2 = 5 so print hello 5 times


    }
    public static void main(String[] args) {
        int n = 5;//1st step
        int m = 1;
        int sum = 0;
        int x = 5;
        int y = 7;
        int first_term = 0;
        int second_term = 1;
        
        // System.out.println(first_term);
        // System.out.println(second_term);
        // //y-2 bcz 1st and second term we print so y = 10-2 means we find other 7 term.
        // printFibo(first_term,second_term,y-2);

        // int ans = printAnFact(x);
        // System.out.println(ans);

        // printRecur(n);//2nd step (n=5)

        // printSumNum(m,6,sum);

    }
}
