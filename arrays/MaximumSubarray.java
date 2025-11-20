import java.util.Scanner;

/**
 * Problem: Maximum Subarray (Kadane's Algorithm)
 *
 * Given an integer array nums, find the contiguous subarray (containing at least
 * one number) which has the largest sum and return its sum.
 *
 * Try:
 * 1. Brute force solution (check all subarrays)
 * 2. Optimized solution using Kadane's Algorithm
 */
public class MaximumSubarray {

    // TODO: Implement the brute force O(n^2) or O(n^3) solution
    public static int maxSubArrayBruteForce(int[] nums) {
        // your code here
        return 0;
    }

    // TODO: Implement Kadane's Algorithm (O(n)) solution
    public static int maxSubArrayKadane(int[] nums) {
        // your code here
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = maxSubArrayKadane(nums);
        System.out.println("Maximum subarray sum = " + result);

        scanner.close();
    }
}


