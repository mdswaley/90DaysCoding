package Sorting;

public class mergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printMerge(int arr[],int si,int ei){
        //base case
        if (si>=ei) {
            return;
        }
        //kaam
        /*1st :-Initial call to printMerge(arr, 0, arr.length-1) with si = 0 and ei = 3.
Calculate mid = 0 + (3-0)/2 = 1, so mid = 1.*/

        int mid = si+(ei-si)/2;// or (si+ei)/2

        /*Left Part (0 to 1): {6, 2}

Calculate mid = 0 + (1-0)/2 = 0, so mid = 0.

Recursively call printMerge(arr, 0, 0) and printMerge(arr, 1, 1).

Left Part (0 to 0): {6}

Base case reached, returns.
Right Part (1 to 1): {2}

Base case reached, returns.
Now, we merge the left and right parts. Call Merge(arr, 0, 0, 1). */
        printMerge(arr, si, mid);//left

        /*Calculate mid = 2 + (3-2)/2 = 2, so mid = 2.

Recursively call printMerge(arr, 2, 2) and printMerge(arr, 3, 3).

Left Part (2 to 2): {7}

Base case reached, returns.
Right Part (3 to 3): {1}

Base case reached, returns.
Now, we merge the left and right parts. Call Merge(arr, 2, 2, 3).

At this point, both left and right parts are sorted and merged back together. Call Merge(arr, 0, 1, 3) to merge the entire array. */
        printMerge(arr, mid+1, ei);//right
        Merge(arr,si,mid,ei);// left + right

    }
    public static void Merge(int arr[],int si,int  mid,int ei){
        //left(0,3)=4ele , right(4,6)=3ele , total = 7 , int[6-0+1] total size.

        //At this point, both left and right parts are sorted and merged back together. Call Merge(arr, 0, 1, 3) to merge the entire array.
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
/*Merging {6, 2} and {7, 1}:

Comparing elements:
6 < 7, so add 6 to the temporary array.
7 > 2, so add 2 to the temporary array.
7 > 1, so add 1 to the temporary array.
Temporary array: {1, 2, 6, 7} */
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;            
        }
//Copy the temporary array back to the original array.
        //for leftover element for 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //for lefttover element for 2st sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy arr temp to orignal arr 
        for(k = 0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] ={6,2,7,1};
        printMerge(arr, 0, arr.length-1);
        printArr(arr);
    }
}
