import java.util.Scanner;

/**
 * Problem: Rotate Array
 *
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 *
 * Try:
 * 1. Extra array solution (O(n) time, O(n) space)
 * 2. In-place reversal solution (O(n) time, O(1) extra space)
 */
public class RotateArray {

    // TODO: Implement rotation using an extra array
    public static void rotateExtraArray(int[] nums, int k) {
        // your code here
    }

    // TODO: Implement in-place rotation using reversals
    public static void rotateInPlace(int[] nums, int k) {
        // your code here
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

        System.out.println("Enter k (steps to rotate right):");
        int k = scanner.nextInt();

        rotateInPlace(nums, k);

        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}


