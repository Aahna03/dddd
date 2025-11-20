import java.util.Scanner;

/**
 * Topic 5: Sorting & Order
 *
 * Q14. Bubble Sort
 *    - Beginner: basic nested loops.
 *    - Optimized: stop early if no swaps in an inner pass.
 *
 * Q15. Selection Sort
 *    - Beginner: find min in unsorted part and swap.
 *
 * Q16. Insertion Sort
 *    - Beginner: insert each element into sorted prefix.
 */
public class BasicSorting {

    // Q14: Bubble Sort (basic)
    public static void bubbleSort(int[] arr) {
        // TODO: implement standard bubble sort
    }

    // Q14: Bubble Sort (optimized with early break)
    public static void bubbleSortOptimized(int[] arr) {
        // TODO: stop outer loop early if no swaps in a pass
    }

    // Q15: Selection Sort
    public static void selectionSort(int[] arr) {
        // TODO: implement selection sort
    }

    // Q16: Insertion Sort
    public static void insertionSort(int[] arr) {
        // TODO: implement insertion sort
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
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

        int[] a1 = arr.clone();
        int[] a2 = arr.clone();
        int[] a3 = arr.clone();

        bubbleSort(a1);
        System.out.println("Bubble sort:");
        printArray(a1);

        bubbleSortOptimized(a2);
        System.out.println("Bubble sort optimized:");
        printArray(a2);

        selectionSort(a3);
        System.out.println("Selection sort:");
        printArray(a3);

        insertionSort(arr);
        System.out.println("Insertion sort:");
        printArray(arr);

        sc.close();
    }
}


