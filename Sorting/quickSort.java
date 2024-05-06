package Sorting;

public class quickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void quckSort(int arr[],int si,int ei){
        if (si>=ei) {
            return;
        }
        //last els take as pivoit 
        int pivIdx = partition(arr,si,ei);

        /*
         quckSort(arr, si, pivIdx-1): (left partition)

Recursively call quckSort(arr, 0, 1) for the left partition [2, 3].
Since it has only two elements, no further partitioning is needed. It's already sorted.
         */
        quckSort(arr, si, pivIdx-1);//left

        /*
         Recursively call quckSort(arr, 3, 5) for the right partition [8, 6, 7].
partition(arr, si, ei):
Pivot is arr[ei] = 7.
i = si - 1 = 2.
Iterate j from si = 3 to ei - 1 = 4:
For j = 3, arr[j] (8) is greater than pivot (7), no action.
For j = 4, arr[j] (6) is less than or equal to pivot (7), swap arr[4] and arr[3]. Array becomes [2, 3, 5, 6, 8, 7].
Increment i (now i = 3).
Swap pivot (arr[ei] = 7) with arr[i]. Array becomes [8, 6, 5, 7, 8, 5].
Return i = 3.
         */

        quckSort(arr, pivIdx+1, ei);//right

    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;//to make place for els smaller than pivot
        
        /*Loop from j = 0 to j < 5:
For j = 0, since arr[0] (6) is greater than pivot (5), nothing happens.
For j = 1, since arr[1] (2) is less than or equal to pivot (5), i is incremented to 0, and elements are swapped: [6, 2, 7, 8, 3, 5] becomes [2, 6, 7, 8, 3, 5].
For j = 2, since arr[2] (7) is greater than pivot (5), nothing happens.
For j = 3, since arr[3] (8) is greater than pivot (5), nothing happens.
For j = 4, since arr[4] (3) is less than or equal to pivot (5), i is incremented to 1, and elements are swapped: [2, 6, 7, 8, 3, 5] becomes [2, 3, 7, 8, 6, 5]. */


        for(int j = si;j<ei;j++){
            if (arr[j]<= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        /*After the loop, i is incremented to 2.
The pivot is swapped with the element at index i, resulting in [2, 3, 5, 8, 6, 7].
i (which is 2) is returned.*/
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        
        return i;

    }

    public static void main(String[] args) {
        int arr[] = {6,2,7,8,3,5};
        quckSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
