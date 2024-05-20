package BackTracking;

public class emptyArr {
    public static void printEmtArr(int arr[],int idx,int val){
        if (idx == arr.length) {
            printArr(arr);//1 2 3 
            return;
        }
        /*
         Initialize an array arr of length 3.
Call printEmtArr(arr, 0, 1).

printEmtArr Method:

idx = 0, val = 1.
idx is not equal to the length of arr, so continue.
arr[0] = 1.
Call printEmtArr(arr, 1, 2).


idx = 1, val = 2.
idx is not equal to the length of arr, so continue.
arr[1] = 2.
Call printEmtArr(arr, 2, 3).

idx = 2, val = 3.
idx is equal to the length of arr.
Print the array: 1 2 3.
Return from this call.
         */
        arr[idx] = val;
        printEmtArr(arr, idx+1, val+1);//fn call step

        /*arr[2] = arr[2] - 2 -> arr[2] = 3 - 2 -> arr[2] = 1.
         arr[1] = arr[1] - 2 -> arr[1] = 2 - 2 -> arr[1] = 0
         arr[0] = arr[0] - 2 -> arr[0] = 1 - 2 -> arr[0] = -1
         */
        arr[idx] = arr[idx]-2;//backTracking step
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[3];
        printEmtArr(arr, 0, 1);
        printArr(arr);//-1 0 1 

    }
}
