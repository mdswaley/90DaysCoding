package BackTracking;

public class subsetOfStr {
    public static void printSubSet(String str,int idx,String ans){
        if (idx == str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            
            return;
        }
        //recursion
        //char say yes to part of our ans
        printSubSet(str, idx+1, ans+str.charAt(idx));
        //char say no to part of our ans
        printSubSet(str, idx+1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubSet(str, 0, "");

    }
}
