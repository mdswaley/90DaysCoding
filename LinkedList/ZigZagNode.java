package LinkedList;

public class ZigZagNode {
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

    public static void addFirst(int data){

        //1 create a new node
        Node newNode = new Node(data);
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

    public static void zigZag(){
        // 1st find mid node
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        } 
        Node mid = slow;

        // 2nd reverse 2nd part or right part
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }

        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        while (left!=null && right!=null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }





    }
    public static void main(String[] args) {
        ZigZagNode ll = new ZigZagNode();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        printLL();
        ll.zigZag();
        printLL();
    }
}
