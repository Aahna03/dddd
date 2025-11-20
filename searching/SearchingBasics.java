import java.util.Arrays;
import java.util.Scanner;

/**
 * Topic: Searching Basics
 *
 * Q1. Linear Search
 *    - Beginner: iterate through each element.
 *    - Optimized: same O(n) scan but focus on writing clean reusable method.
 *
 * Q2. Why Searching Needs Sorted Arrays
 *    - Try binary search on unsorted input to see incorrect behavior.
 *    - Fix: sort array or use hashing if sorting not allowed.
 */
public class SearchingBasics {

    // Q1: Linear search (returns index or -1)
    public static int linearSearch(int[] arr, int target) {
        // TODO: iterate through arr and return index when arr[i] == target
        return -1;
    }

    // Q2: Naive attempt to use binary search on unsorted array (should fail)
    public static int binarySearchOnUnsorted(int[] arr, int target) {
        // TODO: implement standard binary search but call it on unsorted input to observe issues
        return -1;
    }

    // Q2: Correct approach - sort array then binary search
    public static int binarySearchAfterSorting(int[] arr, int target) {
        // TODO: Arrays.sort(arr); then apply binary search
        return -1;
    }

    // Q2: Alternative - use HashSet/HashMap when sorting not allowed (placeholder)
    // public static boolean searchUsingHashing(int[] arr, int target) { ... }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println("Linear search index = " + linearSearch(arr, target));
        System.out.println("Binary search (unsorted) = " + binarySearchOnUnsorted(arr.clone(), target));
        System.out.println("Binary search after sorting = " + binarySearchAfterSorting(arr.clone(), target));
        sc.close();
    }
}


