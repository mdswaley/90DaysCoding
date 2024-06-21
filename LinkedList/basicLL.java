package LinkedList;

import StringBuilder.revString;

public class basicLL {
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

    //Method create to store element and update accoroding to.
    // add();
    // delete();
    // search();
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
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail= newNode;
    }
    // print the linkedList where we add in first or in last
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

    public void addMiddle(int idx,int data){
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        // idx-1 for previous value
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }
        //i=idx-1 ; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        // if no node is in list
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        // if only one node is in ll 
        }else if(size==1){
            int remVal = head.data;
            head=tail=null;
            size=0;
            return remVal;
        }
        int remVal = head.data;
        head=head.next;
        size--;
        return remVal;
    }
    public int removeLast(){
        if (size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int remVal = tail.data;
            tail=head=null;
            size=0;
            return remVal;
        }
        
        // start iterating 
        Node prev=head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int remVal = tail.data;
        prev.next = null;
        size--;
        return remVal;


    }
    //(iterative) Search for a key in a Linked List. Return the position where it is found. If not found, return -1.
    public int searchKey(int key){//TC:-O(n)
        int idx=0;
        Node temp=head;
        while (temp!=null) {
            if (temp.data==key) {
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    /*Search (Recursive):-
Search for a key in a Linked List. Return the position where it is found.
If not found, return -1. Use Recursion. */
public int helper(Node head,int key){
    // TC:- O(n) bcz of helper function and space is also there bcz of call stack which is O(n) linear time. 
    // base case
    if (head==null) {
        return -1;
    }
    if (head.data == key) {
        return 0;
    }
    int idx=helper(head.next, key);
    if (idx == -1) {
        return -1;
    }
    return idx+1;
}
public int recSearch(int key){
    return helper(head,key);
}

public void reverse(){//TC:-O(n)
    Node prev=null;//initialy prev in null bcz head ke pehle null rehta hai.
    Node next;
    Node curr=tail=head; //in java assing value right to left like 1st head value store in tail then tail value store in curr.
    // curr not equal to null means curr is now last node where curr.next is point to null.
    while (curr != null) {
        next = curr.next;//1st curr -> next pointing
        curr.next = prev;//2nd now my curr.next -> prev
        prev=curr;// simply swap like curr is prev
        curr=next;//and again curr is now next 
        //repeat all step until curr is not null;
    }
    //after curr null i update my prev to head bcz my last node is my 1st in reverse 
    head = prev;
}
public void deleteFromlastNth(int n){
    int sz=0;
    Node temp=head;
    
    while (temp!=null) {
        temp=temp.next;
        sz++;
    }


    if (n==sz) {
        head=head.next;
        return;
    }
    
    // sz-n
    int i=1;
    int iToFind=sz-n;
    Node prev=head;
    while (i<iToFind) {
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;

}

// check palindrom
// slow-fast approch
public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while (fast!=null && fast.next!=null) { //fast!=null even case , fast.next!=null odd case 
        slow = slow.next;
        fast= fast.next.next;
    }
    return slow;//bcz slow is now my mid
}

public boolean checkPalindrom(){
    // base case
    if (head==null || head.next==null) {
        return true;
    }

    //1st step find midNode
    Node mid = findMid(head);

    // 2nd step reverse 2nd half
    Node prev=null;
    Node curr = mid;
    Node next;
    while (curr != null) {
        next = curr.next; // next point karta hai curr.next ko 
        curr.next = prev; //curr.next point karta hai null ko
        prev = curr;
        curr=next;    
    }

    Node right = prev;//right half head
    Node left = head;

    // 3rd step check is right equal left or not
    while (right != null) {
        if (left.data != right.data) {
            return false;
        }
        left=left.next;
        right=right.next;
    } 
    return true;

}

// Detect a Loop/cycle in a list
public boolean isLoop(){
    Node slow=head;
    Node fast=head;

    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (fast==slow) {
            return true;
        }
    }
    return false;
}

// if cycle is exist the remove cycle
public void remCycle(){
    // check is cycle exist or not
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast !=null && fast.next !=null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            cycle = true;
            break;
        }
    }
    if (cycle == false) {
        return ;
    }

    // find meeting point
    slow = head;
    Node prev = null;
    while (slow != fast) {
        prev = fast;
        slow=slow.next;
        fast=fast.next;
    }

    // remove cycle ->last.next = null
    prev.next = null;
}

    public static void main(String[] args) {
        basicLL ll = new basicLL();
        // TC:-O(1) constant time complexity.
        // printLL();
        
        // ll.addFirst(1);
        // printLL();
        
        // ll.addFirst(2);
        // printLL();
        
        // ll.addLast(3);
        // printLL();
        
        // ll.addLast(4);
        
        
        // ll.addMiddle(2, 7);
        // printLL();
        
        
        // System.out.println(ll.removeFirst());
        // printLL();
        
        
        // System.out.println(ll.size);

        // System.out.println(ll.removeLast());
        
        // printLL();
        // // using iterative
        // System.out.println("At Idx: "+ll.searchKey(3));
        // // using recursive
        // System.out.println(ll.recSearch(3));

        // // ll.reverse();
        // // printLL();

        // printLL();
        // ll.deleteFromlastNth(1);
        // printLL();

        ll.addLast(1);
        
        
        ll.addLast(2);
        
        
        ll.addLast(2);
    
        ll.addLast(1);

        printLL();

        System.out.println(ll.checkPalindrom());

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // never loop is directly connect with head it seens in middle of node
        // head.next.next.next.next = head; 
        head.next.next.next.next = head.next; 

        System.out.println(ll.isLoop());
        // printLL();
        ll.remCycle();
        System.out.println(ll.isLoop());
        // 
    }
}
