package Queues;

public class LinkedListQueueImp {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LLQueue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int val){
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

        
            int front = head.data;
            if (head == tail) { //if we have only one element
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);

        System.out.println(q.remove());
        q.add(10);
        System.out.println(q.remove());
        q.add(12);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
