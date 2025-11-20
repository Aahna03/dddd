import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Topic: Intermediate Queue Problems
 *
 * Q4. Queue using two stacks (amortized O(1))
 * Q5. Stack using two queues (push/pop balancing)
 * Q6. Generate binary numbers using queue
 */
public class IntermediateQueueProblems {

    // Q4: Queue using two stacks
    public static class MyQueue {
        private final Deque<Integer> in = new ArrayDeque<>();
        private final Deque<Integer> out = new ArrayDeque<>();

        public void enqueue(int x) {
            // TODO: push to in stack
        }

        public int dequeue() {
            // TODO: move elements from in to out only when out empty
            return -1;
        }

        public boolean isEmpty() {
            return in.isEmpty() && out.isEmpty();
        }
    }

    // Q5: Stack using two queues
    public static class MyStack {
        private Queue<Integer> q1 = new LinkedList<>();
        private Queue<Integer> q2 = new LinkedList<>();

        public void push(int x) {
            // TODO: enqueue to q2, move all from q1 to q2, swap q1 & q2
        }

        public int pop() {
            // TODO: pop from q1
            return -1;
        }

        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    // Q6: Generate first n binary numbers using queue
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        // TODO: seed with "1", then generate by appending 0 and 1
        return result;
    }
}


