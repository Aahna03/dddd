import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Topic 7: Advanced Patterns
 *
 * Q14. Longest substring without repeating characters
 *    - Beginner: sliding window with HashSet (check duplicates, restart window).
 *    - Optimized: sliding window with HashMap storing last seen index to achieve O(n).
 */
public class AdvancedStringPatterns {

    // Q14: Sliding window with HashSet (basic)
    public static int longestSubstringNoRepeatHashSet(String s) {
        // TODO: maintain left pointer and HashSet, reset when duplicate found
        return 0;
    }

    // Q14: Sliding window with HashMap (optimized)
    public static int longestSubstringNoRepeatHashMap(String s) {
        // TODO: map char -> last index, move left pointer smartly
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(longestSubstringNoRepeatHashMap(input));
        sc.close();
    }
}


