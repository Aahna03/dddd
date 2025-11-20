import java.util.Arrays;

/**
 * Topic: Optimized Patterns (Counting / Bucket / Radix Sort)
 *
 * Q8. Counting Sort
 *    - Beginner: count occurrences into frequency array, rebuild output.
 *    - Optimized: handle negative numbers or stable reconstruction.
 *
 * Q9. Bucket / Radix Sort
 *    - Beginner: distribute elements into buckets, sort each bucket.
 *    - Optimized: LSD/MSD radix sort for integers; bucket sort for floats.
 */
public class LinearTimeSorting {

    // Q8: Counting sort for non-negative integers
    public static int[] countingSort(int[] arr, int maxValue) {
        // TODO: create freq array [0..maxValue], accumulate counts, rebuild sorted array
        return arr.clone();
    }

    // Q9: Bucket sort for floats in [0,1)
    public static double[] bucketSort(double[] arr, int bucketCount) {
        // TODO: distribute into bucketCount buckets, sort each bucket (e.g., using insertion sort)
        return arr.clone();
    }

    // Q9: Radix sort for non-negative integers (LSD)
    public static void radixSort(int[] arr) {
        // TODO: apply counting sort by digit from LSD to MSD
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 7, 3};
        System.out.println(Arrays.toString(countingSort(data, 10)));
    }
}


