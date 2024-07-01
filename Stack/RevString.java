package Stack;

import java.util.Stack;

public class RevString {
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            res.append(curr);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseStr(s));
    }
}
