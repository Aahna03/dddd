import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem: Two Sum
 *
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 *
 * Try:
 * 1. Brute force solution (O(n^2))
 * 2. Optimized solution using a HashMap (O(n))
 */
public class TwoSum {

    // TODO: Implement the brute force solution here
    public static int[] twoSumBruteForce(int[] nums, int target) {
        // your code here
        return new int[] { -1, -1 };
    }

    // TODO: Implement the optimized solution here
    public static int[] twoSumOptimized(int[] nums, int target) {
        // your code here
        return new int[] { -1, -1 };
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

        System.out.println("Enter target:");
        int target = scanner.nextInt();

        int[] result = twoSumOptimized(nums, target);
        System.out.println("Result indices: [" + result[0] + ", " + result[1] + "]");

        scanner.close();
    }
}


