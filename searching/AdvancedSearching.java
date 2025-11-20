import java.util.Scanner;

/**
 * Topic: Advanced Searching
 *
 * Q10. Search in Rotated Sorted Array
 *    - Beginner: linear search or split into two arrays.
 *    - Optimized: binary search that accounts for rotation pivot.
 */
public class AdvancedSearching {

    // Q10: Search in rotated sorted array (optimized)
    public static int searchRotated(int[] arr, int target) {
        // TODO: modified binary search that checks which half is sorted
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
        System.out.println(searchRotated(arr, target));
        sc.close();
    }
}


