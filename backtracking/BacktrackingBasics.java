import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Topic: Backtracking Basics
 *
 * Q1. Subset Generation
 *    - Beginner: brute-force choose / not choose each element.
 *    - Optimized: include/exclude template with pruning (e.g., sorted input to avoid duplicates).
 *
 * Q2. Permutation Generation
 *    - Beginner: swap-based recursion.
 *    - Optimized: use boolean "used" array for clarity and duplicate handling.
 *
 * Q3. Combination Sum I
 *    - Beginner: try all combinations without pruning.
 *    - Optimized: sort candidates and prune once sum exceeds target.
 */
public class BacktrackingBasics {

    // Q1: Subsets (include/exclude)
    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums); // optional for consistency / duplicates
        List<List<Integer>> result = new ArrayList<>();
        // TODO: call helper with index and current path
        return result;
    }

    // Q2: Permutations using swapping
    public static List<List<Integer>> permutationsSwap(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // TODO: backtrack swapping current index with each candidate
        return result;
    }

    // Q2: Permutations using used[] (handles duplicates)
    public static List<List<Integer>> permutationsUsed(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // TODO: boolean[] used and backtrack depth by depth
        return result;
    }

    // Q3: Combination Sum I
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        // TODO: backtrack with index, remaining sum, and prune when remaining < 0
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}


