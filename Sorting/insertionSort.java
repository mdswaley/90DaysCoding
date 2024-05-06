package Sorting;

public class insertionSort {
    public static void printInsertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Time complexity O(n^2);
        int arr[] = {4,6,1,3,7};
/*Start with the second element (index 1), which is 6. Let's call it the "current" element.
Compare the current element (6) with the element before it (4).
Since 6 is greater than 4, no swap is needed. Move to the next step. */


/*Move to the next element (index 2), which is 1. Let's call it the "current" element.
Compare the current element (1) with the elements before it (6, 4).
1 is less than 6, so we shift 6 to the right.
Now, compare 1 with 4.
1 is less than 4, so we shift 4 to the right as well.
Now, since there are no more elements to compare or the previous element is not greater than the current element, we place the current element (1) in the correct position.
Array after placing 1 in the correct position: {1, 4, 6, 3, 7} */


        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && curr < arr[prev]) {
                arr[prev+1] = arr[prev];
                prev--;

                
            }
            arr[prev+1] = curr;
        }
        printInsertionSort(arr);

    }
}
