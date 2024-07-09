package Queues.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeJCF {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addLast(3);
        dq.addLast(4);

        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
