package Queues.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseTheKthEle {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();

        d.addLast(10);
        d.addLast(20);
        d.addLast(30);
        d.addLast(40);
        d.addLast(50);
        d.addLast(60);
        d.addLast(70);
        d.addLast(80);
        d.addLast(90);
        d.addLast(100);

        int k = 5;
        // [10, 20, 30, 40, 50, 60, 70,80, 90, 100] ,k=5
        // for (int i = 0; i < k; i++) {
        //     int get = d.getFirst();
        //     d.addLast();
        // }
    }
}
