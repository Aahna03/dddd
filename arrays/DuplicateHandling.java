import java.util.*;

/**
 * Topic 6: Duplicate Handling
 *
 * Q18. Remove Duplicates
 *    - Beginner: nested loops / extra array.
 *    - Optimized: HashSet (unsorted) OR two pointers (sorted).
 *
 * Q19. Find All Duplicate Elements
 *    - Beginner: nested loops.
 *    - Optimized: HashMap / frequency count.
 *
 * Q20. Find Frequency of Each Element
 *    - Beginner: nested loops.
 *    - Optimized: HashMap.
 */
public class DuplicateHandling {

    // Q18: Remove duplicates (beginner, O(n^2))
    public static int[] removeDuplicatesBruteForce(int[] arr) {
        // TODO: build new array without duplicates using nested loops
        return null;
    }

    // Q18: Remove duplicates (HashSet)
    public static int[] removeDuplicatesHashSet(int[] arr) {
        // TODO: use HashSet to keep unique elements
        return null;
    }

    // Q18: Remove duplicates (two pointers for sorted array)
    public static int removeDuplicatesTwoPointers(int[] arr) {
        // TODO: in-place remove duplicates in sorted array, return new length
        return 0;
    }

    // Q19: Find all duplicates (brute force)
    public static List<Integer> findDuplicatesBruteForce(int[] arr) {
        // TODO: nested loops to detect duplicates
        return new ArrayList<>();
    }

    // Q19: Find all duplicates (HashMap frequency)
    public static List<Integer> findDuplicatesHashMap(int[] arr) {
        // TODO: count frequency in a HashMap, return keys with freq > 1
        return new ArrayList<>();
    }

    // Q20: Frequency of each element (brute force)
    public static void printFrequencyBruteForce(int[] arr) {
        // TODO: for each element, count how many times it appears (avoid recounting)
    }

    // Q20: Frequency using HashMap
    public static Map<Integer, Integer> frequencyHashMap(int[] arr) {
        // TODO: return map of value -> count
        return new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }
}


