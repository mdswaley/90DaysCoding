package LinkedList;

import java.util.LinkedList;

public class MergeSortLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
    // head mean first node
    public static Node head;
    // tail means last node
    public static Node tail;
    // size used for find the size of node or length.
    public static int size;//it take by default as zero

    public static void addFirst(int data){

        //1 create a new node
        Node newNode = new Node(data);
        size++;
        // base case
        if (head == null) {
            // if head is empty then newNode = tail and head
            head = tail = newNode;
            return;
        }
        //2 newNode next to point previous head  
        newNode.next = head;
        // 3 newNode = head;]
        head = newNode;
    }


    public static void printLL(){  // Tc:-O(n) linear tc
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            
            temp = temp.next;
        }
        System.out.println("null");
        
    }


    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    private Node merge(Node head1,Node head2){ //head1 is my left head and head2 is my right head
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1!=null && head2!=null) {
            if (head1.data <=head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp=temp.next;
            }
        }

        while (head1!=null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2!=null) {
            temp.next = head2;
            head2 = head2.next;
            temp=temp.next;
        }

        return mergedLL.next;//bcz head is my dummy node which is -1.
    }
    
    public Node mergeSort(Node head){
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        
        // 1st find mid
        Node mid = getMid(head);

        // 2nd left and right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // call merge
        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.printLL();

        ll.head = ll.mergeSort(ll.head);

        printLL(); //TC:-O(nlogn)

    }
}
