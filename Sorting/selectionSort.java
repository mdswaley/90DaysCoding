package Sorting;

public class selectionSort {
    public static int printSelectionSort(int arr[]){
        int i;
        for(i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            
        }
        return arr[i];
    
    }
    public static void main(String[] args) {
        //time complexity is O(n^2)
        int arr[] = {4,6,1,8,2};
        printSelectionSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
