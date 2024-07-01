package Stack;

import java.util.Stack;

public class DuplicateParantheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count<1) {
                    return true;  //duplicate pairs
                }else{
                    s.pop();//opening pair 
                }

                // opening 
            }else{
                s.push(ch);
            }
            
            
        }
        return false; //not duplicate pairs

    }
    public static void main(String[] args) {
        String str = "(((a+b)+(c+d)))";

        System.out.println(isDuplicate(str));


    }
}
