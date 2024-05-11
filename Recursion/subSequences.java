package Recursion;

import java.util.HashSet;

public class subSequences {
    public static void subSqns(String str,int idx,String newStr,HashSet<String> set){
        if (idx == str.length()) {
            // System.out.println(newStr);
            //if our new string is contain same string which we print before then we are note add in new string
            if (set.contains(newStr)) {
                return;
            }else{
                //else we have see first time new String then simpley add in new string
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);

        //to be add in new string
        subSqns(str, idx+1, newStr+currChar,set);

        //or not to be add in new String
        subSqns(str, idx+1, newStr,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSqns(str, 0, "",set);
        
    }
}
