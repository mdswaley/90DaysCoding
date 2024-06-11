package ArrayList;

public class equlibriumSum {
    public static void main(String[] args) {
        int arr[] ={1,3,5,2,2};
        int n = arr.length;
        long leftSum = 0;
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
        totalSum += arr[i];
    }
    
    // Traverse the array again to find the equilibrium point
    for (int i = 0; i < n; i++) {
        totalSum -= arr[i]; // Subtract the current element from the total sum
        if (leftSum == totalSum) {
            System.out.println("equlibrium find at:- "+ (i+1)); // Equilibrium point found at index i (1-based indexing)
        }
        leftSum += arr[i]; // Add the current element to the left sum
    }
    
    // System.out.println("not found");// Equilibrium point not found
    }
}