import java.util.Scanner;

/**
 * Topic 3 & 8: Reversal + Two Pointers
 *
 * Q9. Reverse an Array
 *    - Beginner: create new array and copy from end.
 *    - Optimized: in-place two-pointer swap.
 *
 * Q10. Reverse a Subarray [l, r]
 *    - Optimized: two-pointer swap between l and r.
 */
public class ReverseArray {

    // Q9: Beginner - reverse using extra array
    public static int[] reverseWithExtraArray(int[] arr) {
        // TODO: create new array, copy elements from end to start
        return null;
    }

    // Q9: Optimized - reverse in-place using two pointers
    public static void reverseInPlace(int[] arr) {
        // TODO: use i = 0, j = n-1, swap while i < j
    }

    // Q10: Reverse subarray from l to r (0-based indices)
    public static void reverseSubarray(int[] arr, int l, int r) {
        // TODO: in-place reversal between l and r using two pointers
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

        int[] reversed = reverseWithExtraArray(arr.clone());
        System.out.println("Reversed with extra array:");
        printArray(reversed);

        reverseInPlace(arr);
        System.out.println("Reversed in-place:");
        printArray(arr);

        System.out.println("Enter l and r for subarray reversal:");
        int l = sc.nextInt();
        int r = sc.nextInt();
        reverseSubarray(arr, l, r);
        System.out.println("After subarray reversal:");
        printArray(arr);

        sc.close();
    }
}


