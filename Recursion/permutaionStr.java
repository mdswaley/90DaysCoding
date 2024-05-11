package Recursion;

public class permutaionStr {
    public static void printPer(String str,String ans){
        //base case
        if (str.length()==0) {
            //"abc"
            System.out.println(ans);
            return;
        }
        /*
         * Initial call: str = "abc", ans = "".
Iteration 1: curr = 'a', newStr = "bc". Recursive call: printPer("bc", "a").
Iteration 2: curr = 'b', newStr = "ac". Recursive call: printPer("ac", "b").
Iteration 3: curr = 'c', newStr = "ab". Recursive call: printPer("ab", "c").
         */
        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPer(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPer(str, "");
    }
}
