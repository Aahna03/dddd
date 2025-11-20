import java.util.Scanner;

/**
 * Topic 2: Searching
 *
 * Q6. Linear Search (unsorted)
 *    - Beginner: simple scan.
 *
 * Q7. Binary Search (sorted)
 *    - Standard iterative binary search.
 *
 * Q8. First and Last Occurrence
 *    - Beginner: linear scan.
 *    - Optimized: binary search variation to find first and last indices.
 */
public class LinearBinarySearch {

    // Q6: Linear Search (return index or -1)
    public static int linearSearch(int[] arr, int key) {
        // TODO: implement linear search
        return -1;
    }

    // Q7: Standard Binary Search (sorted array)
    public static int binarySearch(int[] arr, int key) {
        // TODO: implement iterative binary search
        return -1;
    }

    // Q8: First Occurrence using Linear Search
    public static int firstOccurrenceLinear(int[] arr, int key) {
        // TODO: scan from left and return first index
        return -1;
    }

    // Q8: Last Occurrence using Linear Search
    public static int lastOccurrenceLinear(int[] arr, int key) {
        // TODO: scan from right and return last index
        return -1;
    }

    // Q8: First Occurrence using Binary Search variation
    public static int firstOccurrenceBinary(int[] arr, int key) {
        // TODO: binary search but go left when equal
        return -1;
    }

    // Q8: Last Occurrence using Binary Search variation
    public static int lastOccurrenceBinary(int[] arr, int key) {
        // TODO: binary search but go right when equal
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n (sorted array for binary search):");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key:");
        int key = sc.nextInt();

        System.out.println("Linear search index = " + linearSearch(arr, key));
        System.out.println("Binary search index = " + binarySearch(arr, key));
        System.out.println("First occurrence (linear) = " + firstOccurrenceLinear(arr, key));
        System.out.println("Last occurrence (linear) = " + lastOccurrenceLinear(arr, key));
        System.out.println("First occurrence (binary) = " + firstOccurrenceBinary(arr, key));
        System.out.println("Last occurrence (binary) = " + lastOccurrenceBinary(arr, key));

        sc.close();
    }
}


