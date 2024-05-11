package Recursion;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2}; // Example input
        System.out.println(findDuplicate(nums)); // Output: 2
    }

    public static int findDuplicate(int[] nums) {
        // Find the intersection point of the two pointers
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the entrance to the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}
