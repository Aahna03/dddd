import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Topic: Intermediate Heap Problems
 *
 * Q6. K largest / smallest elements.
 * Q7. Heap sort.
 */
public class IntermediateHeapProblems {

    // Q6: K largest via sorting (beginner)
    public static int[] kLargestSort(int[] nums, int k) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = copy[copy.length - 1 - i];
        }
        return result;
    }

    // Q6: K largest using min-heap of size k
    public static int[] kLargestHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // TODO: maintain heap of size k
        return new int[k];
    }

    // Q6: K smallest using max-heap or similar logic

    // Q7: Heap sort (in-place using max-heap)
    public static void heapSort(int[] arr) {
        // TODO: build max-heap and repeatedly extract max
    }
}


