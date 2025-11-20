import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Topic 5: Substrings & Subsequence
 *
 * Q10. Find all substrings of a string
 *    - Beginner: nested loops.
 *    - Optimized: explore sliding window / DP when constraints require.
 *
 * Q11. Longest common prefix among strings
 *    - Beginner: compare characters column by column.
 *    - Optimized: Trie or divide & conquer.
 */
public class SubstringProblems {

    // Q10: List all substrings (brute force)
    public static List<String> allSubstrings(String s) {
        // TODO: nested loops to add s.substring(i, j)
        return new ArrayList<>();
    }

    // Q11: Longest common prefix (simple comparison)
    public static String longestCommonPrefixSimple(String[] strs) {
        // TODO: pick first string, compare char by char with others
        return "";
    }

    // Q11: Longest common prefix using divide & conquer (stub)
    public static String longestCommonPrefixDivideAndConquer(String[] strs) {
        // TODO: implement or outline recursion combining prefixes
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(allSubstrings(input));
        sc.close();
    }
}


