package Sorting;

public class bubbleSort {
    public static void printBubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        //bubble short
        //arr.length-1 means for array take loop n-1 time means arr length is 5 n-1 mean 4 time.

        //time complexity = O(n^2)
        //bcz outer loop run = n-1
        //inner loop run = n-1,n-2,n-3...
        //t(n)=(n-1) * (n-1,n-2,n-3...)    where 1,2,3... = constant
        //t(n)=n * n => n^2
        for(int i=0;i<arr.length;i++){
            //after each loop we short one element so arr.len-0-1 means after 1st loop short one element
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    //using 3rd variable
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    //using bitwise operator
                    // arr[j]= arr[j] ^ arr[j+1];
                    // arr[j+1] = arr[j] ^ arr[j+1];
                    // arr[j]= arr[j] ^ arr[j+1];
                }
            }
        }
        printBubbleSort(arr);
    }
}
