import java.util.Scanner;

/**
 * Topic: Binary Search Variants
 *
 * Q5. First and Last Occurrence
 *    - Beginner: linear scan.
 *    - Optimized: lower/upper bound style binary search.
 *
 * Q6. Find Number of Occurrences
 *    - Use indices from Q5 to compute count.
 *
 * Q7. Peak Element (Mountain Array)
 *    - Beginner: scan for max.
 *    - Optimized: binary search using mid vs mid+1 comparison.
 */
public class BinarySearchVariants {

    // Q5: First occurrence (binary search)
    public static int firstOccurrence(int[] arr, int target) {
        // TODO: binary search and keep going left when you find target
        return -1;
    }

    // Q5: Last occurrence (binary search)
    public static int lastOccurrence(int[] arr, int target) {
        // TODO: binary search and keep going right when you find target
        return -1;
    }

    // Q6: Count occurrences using first/last
    public static int countOccurrences(int[] arr, int target) {
        // TODO: use firstOccurrence and lastOccurrence to return count
        return 0;
    }

    // Q7: Peak element in mountain array
    public static int findPeakElement(int[] arr) {
        // TODO: binary search comparing mid with mid+1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("First occurrence = " + firstOccurrence(arr, target));
        System.out.println("Last occurrence = " + lastOccurrence(arr, target));
        System.out.println("Count = " + countOccurrences(arr, target));
        sc.close();
    }
}


