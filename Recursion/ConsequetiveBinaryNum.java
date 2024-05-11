package Recursion;

public class ConsequetiveBinaryNum {
    //Binary Strings Problem Print all binary strings of size N without consecutive ones.
    //consecutive String means not in 1,1 contain same time like :- {0,0,1,0,1,1} not a consecutive
    public static void printCons(int n,int last,String str){
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if(last == 0){
            //sit 0 on chair n
            printCons(n-1, 0, str+"0");
            printCons(n-1, 1, str+"1");
        }else{
            printCons(n-1, 0, str+"0");
        }
        // printCons(n-1, 0, str.append("0"));
        // if (last == 0) {
        //     printCons(n-1, 1, str.append("1"));
        // }
    }
    public static void main(String[] args) {
        
        printCons(3, 0, "");
    }
}
