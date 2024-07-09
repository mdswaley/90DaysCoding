package Queues.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
             return dq.isEmpty();
        }

        public void push(int data){
            dq.addLast(data);
        }

        public int pop(){
            return dq.removeLast();
        }

        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        //System.out.println(s);
    }
}
