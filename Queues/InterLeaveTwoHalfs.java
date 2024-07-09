package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveTwoHalfs {
    public static void interLev(Queue<Integer> q1,int size){
        int sz = size/2;
        Queue<Integer> firstHalf = new LinkedList<>();

        for (int i = 0; i < sz; i++) {
            int rem = q1.remove();
            firstHalf.add(rem);
        }

        while (!firstHalf.isEmpty()) {
            int pk = firstHalf.remove();
            q1.add(pk);
            q1.add(q1.remove());
        }

        while (!q1.isEmpty()) {
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        
        for (int i = 1; i <= 10; i++) {
            q1.add(i);
        }
        

        interLev(q1,q1.size());


    }
}
