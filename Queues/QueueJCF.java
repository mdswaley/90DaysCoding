package Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJCF {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>(); // Queue is a interface so we can not create its object.
        // another way
        // Queue<Integer> q = new ArrayDeque<>(); 

        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
