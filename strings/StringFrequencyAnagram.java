import java.util.*;

/**
 * Topic 4: Frequency & Anagram Problems
 *
 * Q8. Check if two strings are anagrams
 *    - Beginner: sort char arrays and compare.
 *    - Optimized: frequency array / HashMap.
 *
 * Q9. Find first non-repeating character
 *    - Beginner: frequency map then second pass.
 *    - Optimized: LinkedHashMap to maintain order, or single pass with counts + queue.
 */
public class StringFrequencyAnagram {

    // Q8: Sort and compare
    public static boolean areAnagramsSort(String s1, String s2) {
        // TODO: convert to char arrays, sort, compare
        return false;
    }

    // Q8: Frequency map
    public static boolean areAnagramsFrequency(String s1, String s2) {
        // TODO: count characters using int[26] (if lowercase) or HashMap
        return false;
    }

    // Q9: First non-repeating character (two-pass)
    public static char firstNonRepeatingTwoPass(String s) {
        // TODO: count frequencies, loop again to find first char with count 1
        return '\0';
    }

    // Q9: First non-repeating using LinkedHashMap (preserves order)
    public static char firstNonRepeatingLinkedHashMap(String s) {
        // TODO: use LinkedHashMap<Character, Integer>
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(areAnagramsSort(s1, s2));
        sc.close();
    }
}


