import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Topic 10: Sliding Window
 *
 * Q33. Maximum Sum Subarray of Size k
 *    - Beginner: compute sum for every window.
 *    - Optimized: sliding window.
 *
 * Q34. Smallest Subarray with Sum ≥ K
 *    - Beginner: brute force.
 *    - Optimized: sliding window / two pointers.
 *
 * Q35. Longest Subarray with K Distinct Elements
 *    - Optimized: sliding window + HashMap frequency.
 */
public class SlidingWindowProblems {

    // Q33: Maximum sum subarray of size k (brute force)
    public static int maxSumSubarraySizeKBruteForce(int[] arr, int k) {
        // TODO: for each starting index, compute sum of next k elements
        return 0;
    }

    // Q33: Maximum sum subarray of size k (sliding window)
    public static int maxSumSubarraySizeKWindow(int[] arr, int k) {
        // TODO: maintain window sum, slide by removing left and adding right
        return 0;
    }

    // Q34: Smallest subarray with sum >= K (brute force)
    public static int minLengthSubarrayAtLeastKBruteForce(int[] arr, int k) {
        // TODO: check all subarrays, track minimal length with sum >= k
        return -1;
    }

    // Q34: Smallest subarray with sum >= K (sliding window)
    public static int minLengthSubarrayAtLeastKWindow(int[] arr, int k) {
        // TODO: two pointers, expand right, shrink left while sum >= k
        return -1;
    }

    // Q35: Longest subarray with K distinct elements
    public static int longestSubarrayKDistinct(int[] arr, int k) {
        // TODO: sliding window + HashMap to count frequencies, shrink when > k
        return 0;
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

        System.out.println("Enter k (for fixed window / distinct elements):");
        int k = sc.nextInt();

        System.out.println("Max sum subarray of size k (brute) = " + maxSumSubarraySizeKBruteForce(arr, k));
        System.out.println("Max sum subarray of size k (window) = " + maxSumSubarraySizeKWindow(arr, k));

        sc.close();
    }
}


