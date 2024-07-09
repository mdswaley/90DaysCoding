package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();

        while (!q.isEmpty()) { //push ele q into stack
            st.push(q.remove());
        }

        while (!st.isEmpty()) { //remove ele stack and add into q
            q.add(st.pop());
        }

        while (!q.isEmpty()) { //print 
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
    }
}
