import java.util.Arrays;

/**
 * Topic: Heap Operations
 *
 * Q4. Insert into heap (bubble-up).
 * Q5. Delete / extract min-max (swap with last, remove, heapify-down).
 */
public class HeapOperations {

    public static class MinHeap {
        private final int[] data;
        private int size = 0;

        public MinHeap(int capacity) {
            data = new int[capacity];
        }

        public void insert(int value) {
            if (size == data.length) throw new IllegalStateException("Heap full");
            data[size] = value;
            heapifyUp(size);
            size++;
        }

        public int extractMin() {
            if (size == 0) throw new IllegalStateException("Heap empty");
            int min = data[0];
            data[0] = data[size - 1];
            size--;
            heapifyDown(0);
            return min;
        }

        private void heapifyUp(int index) {
            // TODO: bubble-up while parent greater than child
        }

        private void heapifyDown(int index) {
            // TODO: compare children and swap with smaller child
        }

        @Override
        public String toString() {
            return Arrays.toString(Arrays.copyOf(data, size));
        }
    }
}


