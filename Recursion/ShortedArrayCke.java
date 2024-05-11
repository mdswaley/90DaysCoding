package Recursion;

public class ShortedArrayCke {
    public static boolean printArr(int idx, int arr[]){
        if (idx == arr.length-1) {
            return true;
        }
        int currIdx = arr[idx];
        int nextIdx = arr[idx+1];

        if (currIdx < nextIdx) {
            return printArr(idx+1, arr);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int idx = 0;
        System.out.println(printArr(idx, arr));
        
    }
}
