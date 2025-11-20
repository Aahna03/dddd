import java.util.Scanner;

/**
 * Topic 5: Sorting & Order
 *
 * Q17. Find Second Largest
 *    - Beginner: sort array and take second largest.
 *    - Optimized: single pass tracking largest and second largest
 *      (or use a small heap / priority queue).
 */
public class SecondLargest {

    // Beginner: sort and pick second largest
    public static int secondLargestBySorting(int[] arr) {
        // TODO: copy array, sort, return second largest distinct value
        return -1;
    }

    // Optimized: single pass
    public static int secondLargestSinglePass(int[] arr) {
        // TODO: track largest and second largest in one scan
        return -1;
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

        System.out.println("Second largest (sorting) = " + secondLargestBySorting(arr));
        System.out.println("Second largest (single pass) = " + secondLargestSinglePass(arr));

        sc.close();
    }
}


