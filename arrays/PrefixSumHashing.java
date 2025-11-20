import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Topic 9: Prefix Sum & Hashing
 *
 * Q30. Subarray Sum = K
 *    - Beginner: brute force all subarrays.
 *    - Optimized: prefix sum + HashMap (count of prefix sums).
 *
 * Q31. Longest Subarray with Equal 0s and 1s
 *    - Optimized: prefix sum (treat 0 as -1) + HashMap.
 *
 * Q32. Subarray with 0 Sum
 *    - Optimized: prefix sum + HashSet / HashMap.
 */
public class PrefixSumHashing {

    // Q30: Subarray sum = K (brute force)
    public static boolean hasSubarraySumKBruteForce(int[] arr, int k) {
        // TODO: check every subarray sum
        return false;
    }

    // Q30: Subarray sum = K (prefix sum + HashMap)
    public static boolean hasSubarraySumKPrefix(int[] arr, int k) {
        // TODO: use running sum and map<sum, count or index>
        return false;
    }

    // Q31: Longest subarray with equal 0s and 1s
    public static int longestEqualZeroOne(int[] arr) {
        // TODO: treat 0 as -1 and use prefix sum + first index map
        return 0;
    }

    // Q32: Subarray with 0 sum
    public static boolean hasZeroSumSubarray(int[] arr) {
        // TODO: if any prefix sum repeats or is 0, then such subarray exists
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

        System.out.println("Enter k for subarray sum = k:");
        int k = sc.nextInt();
        System.out.println("Has subarray with sum k (brute force)? " + hasSubarraySumKBruteForce(arr, k));
        System.out.println("Has subarray with sum k (prefix)? " + hasSubarraySumKPrefix(arr, k));

        sc.close();
    }
}


