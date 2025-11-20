import java.util.Scanner;

/**
 * Topic: Binary Search Core
 *
 * Q3. Basic Binary Search
 *    - Beginner: implement iterative binary search using low/high/mid.
 *    - Emphasize boundary updates and termination condition.
 *
 * Q4. Order-Agnostic Binary Search
 *    - Beginner: attempt both ascending & descending manually.
 *    - Optimized: detect sort order (arr[low] < arr[high]) and adapt comparisons.
 */
public class BinarySearchCore {

    // Q3: Standard binary search on ascending array
    public static int binarySearchAscending(int[] arr, int target) {
        // TODO: implement iterative binary search returning index or -1
        return -1;
    }

    // Q4: Order-agnostic binary search (works for ascending or descending)
    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        // TODO: determine if array is ascending or descending and apply binary search logic accordingly
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

        System.out.println("Binary search ascending = " + binarySearchAscending(arr, target));
        System.out.println("Order-agnostic binary search = " + orderAgnosticBinarySearch(arr, target));
        sc.close();
    }
}


