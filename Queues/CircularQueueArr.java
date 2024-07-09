package Queues;

public class CircularQueueArr {
    static class CirQueue{
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        CirQueue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) { // means we add first element then front is -1 so change to 0 
                front = 0;
            }
            rear = (rear+1)%size; // ex:- (-1+1)%3 = 0%3 = 0(add element if 0th index)
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int res = arr[front]; //remove element in front value.
        
            if (rear == front) { // if we remove last element then shift rear and front to -1 .
                rear = front = -1;
            }else{
                front = (front+1) % size; // remove ele from front then shif front to next ex :-
                // (1+1) % 3 = 2%3 = 2 (shift front to 2nd index element)
            }
            return res;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        CirQueue q = new CirQueue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
