import java.util.Arrays;
import java.util.Scanner;

/**
 * Topic: Basic Sorting (Bubble, Selection, Insertion)
 *
 * Q1. Bubble Sort
 *    - Beginner: nested loops, swap adjacent if out of order.
 *    - Optimized insight: detect sorted array early and know it’s O(n^2).
 *
 * Q2. Selection Sort
 *    - Beginner: find min in unsorted region and swap.
 *    - Optimized insight: fewer swaps, good when swap cost is high.
 *
 * Q3. Insertion Sort
 *    - Beginner: shift larger elements to make room for key.
 *    - Optimized insight: excellent for nearly sorted arrays.
 */
public class BasicSortingAlgorithms {

    // Q1: Basic bubble sort
    public static void bubbleSort(int[] arr) {
        // TODO: implement standard bubble sort with nested loops
    }

    // Q1: Bubble sort with early stopping when no swaps occur
    public static void bubbleSortEarlyExit(int[] arr) {
        // TODO: break out early if inner loop makes zero swaps
    }

    // Q2: Selection sort (min element each pass)
    public static void selectionSort(int[] arr) {
        // TODO: for i in [0, n-1) find min index and swap
    }

    // Q3: Insertion sort
    public static void insertionSort(int[] arr) {
        // TODO: pick key, shift greater elements, insert key
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] a1 = arr.clone();
        int[] a2 = arr.clone();
        int[] a3 = arr.clone();

        bubbleSort(a1);
        bubbleSortEarlyExit(a2);
        selectionSort(a3);
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}


