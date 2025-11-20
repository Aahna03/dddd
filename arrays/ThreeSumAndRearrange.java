import java.util.*;

/**
 * Topic 8: Two Pointers Technique
 *
 * Q27. Triplet with Given Sum (3-sum)
 *    - Beginner: triple nested loops.
 *    - Optimized: sort + two pointers inside one loop.
 *
 * Q28. Move Zeroes to End
 *    - Beginner: build new array and then copy back.
 *    - Optimized: two pointers / partition.
 *
 * Q29. Segregate Positive & Negative
 *    - Beginner: extra array.
 *    - Optimized: two-pointer partition (like partition step of quicksort).
 */
public class ThreeSumAndRearrange {

    // Q27: 3-sum brute force - check all triplets
    public static boolean threeSumBruteForce(int[] arr, int target) {
        // TODO: triple nested loops to see if any (i, j, k) sum to target
        return false;
    }

    // Q27: 3-sum optimized - sort and use two pointers
    public static boolean threeSumTwoPointers(int[] arr, int target) {
        // TODO: sort array, fix one index, then use two pointers for the remaining two
        return false;
    }

    // Q28: Move zeroes to end (brute force using extra array)
    public static void moveZeroesBruteForce(int[] arr) {
        // TODO: create new array, first fill non-zero, then zeroes, copy back
    }

    // Q28: Move zeroes to end (two pointers)
    public static void moveZeroesTwoPointers(int[] arr) {
        // TODO: maintain index of next non-zero position
    }

    // Q29: Segregate positive & negative (brute force using extra array)
    public static int[] segregatePosNegExtra(int[] arr) {
        // TODO: build new array with negatives first, then positives
        return null;
    }

    // Q29: Segregate positive & negative in-place (two-pointer partition)
    public static void segregatePosNegInPlace(int[] arr) {
        // TODO: partition array so that all negatives are on left, positives on right
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Use this main to test each function manually if you like.
    }
}


