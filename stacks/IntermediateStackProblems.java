import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Topic: Intermediate Stack Problems
 *
 * Q4. Next Greater Element
 *    - Beginner: nested loops.
 *    - Optimized: monotonic decreasing stack.
 *
 * Q5. Min Stack
 *    - Beginner: keep separate array of mins.
 *    - Optimized: auxiliary stack storing current min.
 *
 * Q6. Balanced Expression Evaluation (e.g., infix to postfix or expression value)
 *    - Beginner: manually check precedence without stack (messy).
 *    - Optimized: stack for operands/operators or convert to postfix.
 */
public class IntermediateStackProblems {

    // Q4: Next Greater Element (brute force)
    public static int[] nextGreaterElementBruteForce(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        // TODO: double loop to find next greater
        return result;
    }

    // Q4: Next Greater Element (stack)
    public static int[] nextGreaterElementStack(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>(); // stores indices
        // TODO: iterate and maintain decreasing stack
        return result;
    }

    // Q5: Min Stack implementation
    public static class MinStack {
        private final Deque<Integer> stack = new ArrayDeque<>();
        private final Deque<Integer> minStack = new ArrayDeque<>();

        public void push(int val) {
            // TODO: push to stack, update minStack
        }

        public void pop() {
            // TODO: pop from both stacks
        }

        public int top() {
            // TODO: return top of stack
            return -1;
        }

        public int getMin() {
            // TODO: return top of minStack
            return -1;
        }
    }

    // Q6: Balanced expression evaluation (placeholder)
    public static int evaluateExpression(String expression) {
        // TODO: implement stack-based evaluation or conversion to postfix
        return 0;
    }
}


