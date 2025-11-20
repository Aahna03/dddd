import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Topic: Advanced Recursion
 *
 * Q9. N-Queens Problem
 *    - Beginner: place queens row by row without checks (will fail).
 *    - Optimized: backtracking with safety checks (columns, diagonals).
 *
 * Q10. Palindrome Partitioning
 *    - Beginner: try every partition recursively.
 *    - Optimized: backtracking + DP / memoization for palindrome checks.
 */
public class AdvancedRecursionProblems {

    // Q9: N-Queens
    public static List<List<String>> solveNQueens(int n) {
        // TODO: backtracking approach storing column/diag usage
        return new ArrayList<>();
    }

    // Helper methods for N-Queens (isSafe, build board, etc.)

    // Q10: Palindrome partitioning
    public static List<List<String>> palindromePartition(String s) {
        // TODO: backtracking to split string into palindromic substrings
        return new ArrayList<>();
    }

    // Helper: check palindrome (could memoize)
    private static boolean isPalindrome(String s, int left, int right) {
        // TODO: compare characters while left < right
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindromePartition("aab"));
    }
}


