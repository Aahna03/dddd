import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Topic: Backtracking
 *
 * Q6. Generate all subsets
 *    - Beginner: include/exclude recursion.
 *    - Optimized: backtracking with pruning or sorted order.
 *
 * Q7. Generate all permutations
 *    - Beginner: swap elements recursively.
 *    - Optimized: backtracking with used[] array to avoid duplicate swaps.
 *
 * Q8. Rat in a Maze
 *    - Beginner: try all moves without tracking visited cells.
 *    - Optimized: use visited matrix to avoid cycles and prune invalid paths.
 */
public class BacktrackingProblems {

    // Q6: Subsets include/exclude
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // TODO: call helper with index and current subset
        return result;
    }

    // Q7: Permutations via swapping
    public static List<List<Integer>> permutationsSwap(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // TODO: backtrack by swapping current index with every candidate
        return result;
    }

    // Q7: Permutations using used[] array (handles duplicates easier)
    public static List<List<Integer>> permutationsUsedArray(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // TODO: use boolean[] used to track which nums are in current path
        return result;
    }

    // Q8: Rat in a Maze
    public static List<String> ratInMaze(int[][] maze) {
        List<String> paths = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        // TODO: call helper to explore paths (D,R,U,L) with pruning
        return paths;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}


