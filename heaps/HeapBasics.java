import java.util.Arrays;

/**
 * Topic: Heap Basics
 *
 * Q1. Understand min/max heap concepts.
 * Q2. Array representation (index math for children).
 * Q3. Build heap (insert vs heapify).
 */
public class HeapBasics {

    // Q1/Q2: Utility to get left/right child indices
    public static int leftChild(int index) {
        return 2 * index + 1;
    }

    public static int rightChild(int index) {
        return 2 * index + 2;
    }

    // Q3: Build heap by inserting one-by-one (O(n log n))
    public static void buildHeapByInsertion(int[] arr) {
        MinHeap heap = new MinHeap(arr.length);
        for (int value : arr) {
            heap.insert(value);
        }
        System.arraycopy(heap.data, 0, arr, 0, heap.size);
    }

    // Q3: Build heap using heapify (O(n))
    public static void heapify(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(arr, n, i);
        }
    }

    private static void siftDown(int[] arr, int size, int index) {
        // TODO: standard heapify-down (min-heap or max-heap depending on requirement)
    }

    // Simple min-heap implementation for learning
    public static class MinHeap {
        private final int[] data;
        private int size = 0;

        public MinHeap(int capacity) {
            data = new int[capacity];
        }

        public void insert(int value) {
            // TODO: insert at end then heapify-up
        }

        private void heapifyUp(int index) {
            // TODO: bubble-up while parent > child
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 1, 2};
        heapify(arr);
        System.out.println(Arrays.toString(arr));
    }
}


