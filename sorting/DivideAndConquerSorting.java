import java.util.Scanner;

/**
 * Topic: Divide & Conquer Sorting
 *
 * Q6. Merge Sort
 *    - Beginner: recursively split array and merge sorted halves.
 *    - Optimized: understand time complexity O(n log n), stability, and memory usage.
 *
 * Q7. Quick Sort
 *    - Beginner: pick pivot (e.g., last element), partition.
 *    - Optimized: randomized pivot to avoid worst case; tail recursion optimizations.
 */
public class DivideAndConquerSorting {

    // Q6: Merge sort entry
    public static void mergeSort(int[] arr) {
        // TODO: call recursive helper with temp buffer
    }

    // Q6: Recursive helper
    private static void mergeSort(int[] arr, int left, int right, int[] temp) {
        // TODO: divide array and merge sorted halves
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        // TODO: merge step
    }

    // Q7: Quick sort entry
    public static void quickSort(int[] arr) {
        // TODO: call recursive helper
    }

    private static void quickSort(int[] arr, int low, int high) {
        // TODO: partition and recurse
    }

    private static int partition(int[] arr, int low, int high) {
        // TODO: Lomuto or Hoare partition
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr.clone());
        quickSort(arr.clone());
        sc.close();
    }
}


