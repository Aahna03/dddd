import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Topic: Intermediate Backtracking
 *
 * Q4. Combination Sum II
 *    - Beginner: try all combos (duplicates repeated).
 *    - Optimized: sort + skip duplicates + prune when sum passes target.
 *
 * Q5. Letter Combinations of a Phone Number
 *    - Beginner: nested loops per digit.
 *    - Optimized: DFS/backtracking using digit→letters map.
 *
 * Q6. Sudoku Solver
 *    - Beginner: fill sequentially without early invalid checks.
 *    - Optimized: backtracking + row/col/box validity checks to prune.
 */
public class IntermediateBacktracking {

    // Q4: Combination Sum II (each candidate used once, handle duplicates)
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        // TODO: backtrack with index, skip duplicate candidates at same depth
        return result;
    }

    // Q5: Letter combinations (digits 2-9)
    private static final Map<Character, String> PHONE_MAP = new HashMap<>();
    static {
        PHONE_MAP.put('2', "abc");
        PHONE_MAP.put('3', "def");
        PHONE_MAP.put('4', "ghi");
        PHONE_MAP.put('5', "jkl");
        PHONE_MAP.put('6', "mno");
        PHONE_MAP.put('7', "pqrs");
        PHONE_MAP.put('8', "tuv");
        PHONE_MAP.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        // TODO: backtrack over digits, append characters from map
        return result;
    }

    // Q6: Sudoku solver (9x9)
    public static void solveSudoku(char[][] board) {
        // TODO: implement backtracking solver with helper methods (isValid, etc.)
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}


