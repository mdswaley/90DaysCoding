package Stack;

import java.util.Stack;

public class PushAtBtm {
    public static void PushAtBottom(Stack<Integer> s,int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        PushAtBottom(s, 5);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
