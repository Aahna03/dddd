import java.util.Arrays;

/**
 * Topic 6: Pattern Searching
 *
 * Q12. Naive pattern searching
 *    - Beginner: try every starting index.
 *
 * Q13. KMP / Rabin-Karp string matching
 *    - Implement KMP preprocessing (LPS array) + search.
 *    - Optional: add Rabin-Karp rolling hash version.
 */
public class PatternSearching {

    // Q12: Naive pattern search
    public static int naiveSearch(String text, String pattern) {
        // TODO: return first index where pattern occurs, or -1
        return -1;
    }

    // Q13: KMP search
    public static int kmpSearch(String text, String pattern) {
        // TODO: build LPS array, run KMP, return index or -1
        return -1;
    }

    // Helper: build LPS array for KMP
    public static int[] buildLps(String pattern) {
        // TODO: compute longest proper prefix which is also suffix for each prefix
        return new int[pattern.length()];
    }

    // Q13: Rabin-Karp (optional)
    public static int rabinKarp(String text, String pattern) {
        // TODO: rolling hash approach
        return -1;
    }

    public static void main(String[] args) {
        String text = "ababcabcabababd";
        String pattern = "ababd";
        System.out.println(kmpSearch(text, pattern));
    }
}


