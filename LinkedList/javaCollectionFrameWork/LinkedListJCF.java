package LinkedList.javaCollectionFrameWork;

import java.util.LinkedList;

public class LinkedListJCF {
    public static void main(String[] args) {
        //create - objects int, float, boolean -> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();    
        
        //add in a ll
        ll.addLast(1);
        ll.addFirst(2);
        ll.addLast(3);
        System.out.println(ll.size());
        // System.out.println(ll);

        // ll.removeFirst();
        // System.out.println(ll);
    }
}
