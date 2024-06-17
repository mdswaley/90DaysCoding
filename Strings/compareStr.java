package Strings;

public class compareStr {
    public static void main(String[] args) {
        String n1="MD";
        String n2="MD";
        //check compare to method 
        //1:- n1>n2:- +ve
        //2:- n1 == n2 :- 0
        //3:- n1<n2 :- -ve

        if (n1.compareTo(n2)==0) {
            System.out.println("same");
        }else{
            System.out.println("different");
        }

        //don't use == bcz in java most of case it fail where compareTo is good for all cases.
        // if (n1==n2) {
        //     System.out.println("same");
        // }else{
        //     System.out.println("different");
        // }
    }
}
