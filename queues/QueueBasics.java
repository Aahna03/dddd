import java.util.NoSuchElementException;

/**
 * Topic: Queue Basics
 *
 * Q1. Array implementation (shift vs circular index)
 * Q2. Linked list implementation (front & rear pointers)
 * Q3. Circular queue
 */
public class QueueBasics {

    // Q1: Array queue with shifting (inefficient)
    public static class ArrayQueueShift {
        private final int[] data;
        private int size = 0;

        public ArrayQueueShift(int capacity) {
            data = new int[capacity];
        }

        public void enqueue(int value) {
            if (size == data.length) throw new IllegalStateException("Queue full");
            data[size++] = value;
        }

        public int dequeue() {
            if (size == 0) throw new NoSuchElementException();
            int value = data[0];
            // naive shift
            for (int i = 1; i < size; i++) {
                data[i - 1] = data[i];
            }
            size--;
            return value;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    // Q1 optimized: circular queue
    public static class CircularQueueArray {
        private final int[] data;
        private int front = 0;
        private int rear = 0;
        private int size = 0;

        public CircularQueueArray(int capacity) {
            data = new int[capacity];
        }

        public void enqueue(int value) {
            // TODO: add element using circular indices
        }

        public int dequeue() {
            // TODO: remove element using circular indices
            return -1;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    // Q2: Linked list queue
    public static class LinkedListQueue {
        private ListNode front;
        private ListNode rear;

        public void enqueue(int value) {
            // TODO: append node at rear
        }

        public int dequeue() {
            // TODO: remove front node and return value
            return -1;
        }

        public boolean isEmpty() {
            return front == null;
        }
    }

    // Q3: Circular queue using linked list (optional extension)
}


