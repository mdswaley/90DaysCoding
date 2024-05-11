package Recursion;

public class RevAStrRec {
    public static void printStr(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printStr(str, idx-1);
        // System.out.println(idx);
        
        
        

    }
    public static void main(String[] args) {
        String str = "abcd";
        printStr(str, str.length()-1);

        
    }
}
