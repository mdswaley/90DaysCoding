package Queues;

public class ArrayImplementation {
    static class QueueImp{
        static int[] arr;
        static int size;
        static int rear;

        QueueImp(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if (rear == size-1) { // means if rear or add ele is equal to size of array which is n-1 then queue is full.
                System.out.println("Queue is full");
                return;
            }
            rear++; //
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // remove from front
            int front = arr[0];

            // sift element in 1 th position into 0th position same for other element.
            // we are going upto rear bcz add element is increse rear so rear = size of arr.
            for (int i = 0; i < rear; i++) {
                // arr[0] = arr[0+1];
                arr[i] = arr[i+1];
            }
            rear--; //
            return front;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

    }
    public static void main(String[] args) {
        QueueImp q = new QueueImp(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
