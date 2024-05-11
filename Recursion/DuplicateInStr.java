package Recursion;

public class DuplicateInStr {
    public static boolean[] map = new boolean[25];//map array is initialy false for all 25 size of array
    public static void removeDuplicate(String str,int idx,String newStr){
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true) {
            removeDuplicate(str, idx+1, newStr);
        }else{
            newStr += currChar;
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        removeDuplicate("abac", 0, "");
    }
}
