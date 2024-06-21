package LinkedList;

public class FindNthFLst {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class NthNodeFromEnd {
        
        public static int getNthFromEnd(Node head, int n) {
            if (head == null)
                return -1;
    
            Node fast = head;
            Node slow = head;
    
            // Move fast pointer to the Nth node from the beginning
            for (int i = 0; i < n; i++) {
                if (fast == null)
                    return -1; // Out of bounds
                fast = fast.next;
            }
    
            // Move both pointers simultaneously until fast reaches the end
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
    
            // Now slow is pointing to the Nth node from the end
            return slow.data;
        }
    }
    public static void main(String[] args) {
                // Constructing the example linked list: 1->2->3->4->5->6->7->8->9
                
                Node head = new Node(1);
                head.next = new Node(2);
                head.next.next = new Node(3);
                head.next.next.next = new Node(4);
                head.next.next.next.next = new Node(5);
                head.next.next.next.next.next = new Node(6);
                head.next.next.next.next.next.next = new Node(7);
                head.next.next.next.next.next.next.next = new Node(8);
                head.next.next.next.next.next.next.next.next = new Node(9);
        
                int n = 2; // Nth node from end to find
                System.out.println("Output: " + NthNodeFromEnd.getNthFromEnd(head, n));
            }
    }