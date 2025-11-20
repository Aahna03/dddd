import java.util.Scanner;

/**
 * Topic 7: Subarray & Subsequence
 *
 * Q21. Print All Subarrays
 *    - Beginner: use two/three nested loops.
 *
 * Q22. Maximum Subarray Sum
 *    - Implement brute force version here, optimized in MaximumSubarray.java.
 *
 * Q23. Subarray with Given Sum
 *    - Beginner: brute force all subarrays.
 *    - Optimized: Prefix Sum / HashMap (or two pointers for positives).
 */
public class SubarraysBasics {

    // Q21: Print all subarrays of arr
    public static void printAllSubarrays(int[] arr) {
        // TODO: use two loops for start and end, and print each subarray
    }

    // Q22: Maximum subarray sum (brute force)
    public static int maxSubArrayBruteForce(int[] arr) {
        // TODO: O(n^2) or O(n^3) approach to find max subarray sum
        return 0;
    }

    // Q23: Subarray with given sum (brute force)
    public static boolean hasSubarrayWithSumBruteForce(int[] arr, int target) {
        // TODO: check every subarray sum
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("All subarrays:");
        printAllSubarrays(arr);

        System.out.println("Max subarray sum (brute force) = " + maxSubArrayBruteForce(arr));

        System.out.println("Enter target sum:");
        int target = sc.nextInt();
        System.out.println("Has subarray with sum (brute force)? " + hasSubarrayWithSumBruteForce(arr, target));

        sc.close();
    }
}


