package Recursion;

public class OccurenceOfStr {
    //static bcz constant in recursion . not create always.
    public static int first = -1;
    public static int last = -1;
    public static void printOccStr(String str,int idx,char element){
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == element) {
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        printOccStr(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdafacc";
        printOccStr(str, 0, 'a');
        
    }
}
