package Sorting;

public class searchInRotatedArr {
    public static int search(int arr[],int tar,int si,int ei){
        //base case
        if (si>ei) {
            return -1;
        }
        // find target index 5.
        /*si = 0, ei = 6
        Calculate mid = (0 + 6) / 2 = 3.
        Check if tar == arr[mid]. No, 5 != 7.
        Check if arr[si] < arr[mid]. Yes, 4 < 7.
        Check if arr[si] <= tar <= arr[mid]. Yes, 4 <= 5 <= 7.
        Recurse with si = 0, ei = mid - 1 = 2.
        Next call:

        si = 0, ei = 2
        Calculate mid = (0 + 2) / 2 = 1.
        Check if tar == arr[mid]. Yes, 5 == 5.
        Return mid = 1.
         */ 


        //  find target index 1
        /*
         si = 0, ei = 6
        Calculate mid = (0 + 6) / 2 = 3.
        Check if tar == arr[mid]. No, 1 != 7.
        Check if arr[si] < arr[mid]. Yes, 4 < 7.
        Check if arr[si] <= tar <= arr[mid]. No, 4 <= 1 <= 7 is false.
        Else, recurse with si = mid + 1 = 4, ei = 6.
        Next call:

        si = 4, ei = 6
        Calculate mid = (4 + 6) / 2 = 5.
        Check if tar == arr[mid]. Yes, 1 == 1.
        Return mid = 5.
         */


        //kaam
        int mid = si+(ei-si)/2;
        if(tar==arr[mid]){
            return mid;
        }

        //for line 1 
        if(arr[si]<arr[mid]){
            //case 1: l1 left
            if (arr[si]<=tar && tar<=arr[mid]) {
                return search(arr, tar, si, mid-1);
            }else{
            //case 2: mid right
                return search(arr, tar, mid+1, ei);
            }
        }else{
            // for line 2
            if (arr[mid]<=tar && tar<=arr[ei]) {
            //case 3: l2 left
                return search(arr, tar, si, mid-1);
            }else{
            //case 4: mid right
                return search(arr, tar, mid+1, ei);
            }
        
        }
        // return search(arr, tar, mid+1, ei);

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 5;
        int tarIdx = search(arr, tar, 0, arr.length-1);
        System.out.println(tarIdx);

    }
}
