package LinkedList.DoublyLL;

public class DoubleLL {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data){
        // create newNode
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    // add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    //remove first
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }

    // remove last
    public void removeLast(){
        if (head==null) {
            System.out.println("List is empty.");
            return;
        }
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    public void reverseDLL(){
        Node curr=head;
        Node prev=null;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // print LL
    public void printLL(){
        Node temp = head;
        while (temp!=null) {
            
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(6);
        dll.addLast(7);
        dll.removeFirst();
        dll.removeLast();
        dll.reverseDLL();

        dll.printLL();
        System.out.println(dll.size);
    }
}
