import java.util.Arrays;

/**
 * Topic: Advanced Sorting
 *
 * Q10. Sort Colors / Dutch National Flag
 *    - Beginner: count colors and overwrite array in multiple passes.
 *    - Optimized: three-pointer (low, mid, high) single pass partition.
 */
public class AdvancedSortingProblems {

    // Q10: Counting approach (brute force)
    public static void sortColorsCounting(int[] nums) {
        // TODO: count 0s, 1s, 2s then overwrite array
    }

    // Q10: Dutch National Flag algorithm
    public static void sortColorsDutchFlag(int[] nums) {
        // TODO: use low/mid/high pointers; swap based on value
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColorsDutchFlag(nums);
        System.out.println(Arrays.toString(nums));
    }
}


