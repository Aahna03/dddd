import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Topic: Stack Basics
 *
 * Q1. Implement stack using array
 *    - Beginner: fixed-size array, track top index.
 *
 * Q2. Implement stack using linked list
 *    - Beginner: use ListNode and maintain head as top.
 *
 * Q3. Valid Parentheses
 *    - Beginner: push opening brackets, pop when encountering closing brackets.
 *    - Optimized: use map for bracket pairs + early validation.
 */
public class StackBasics {

    // Q1: Array-based stack (simple implementation)
    public static class ArrayStack {
        private final int[] data;
        private int top = -1;

        public ArrayStack(int capacity) {
            data = new int[capacity];
        }

        public void push(int value) {
            // TODO: check overflow then push
        }

        public int pop() {
            // TODO: check underflow then pop
            return -1;
        }

        public int peek() {
            // TODO: return top element
            return -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    // Q2: Linked list-based stack
    public static class LinkedListStack {
        private ListNode head;

        public void push(int value) {
            // TODO: insert new node at head
        }

        public int pop() {
            // TODO: remove head node and return value
            return -1;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    // Q3: Valid parentheses
    public static boolean isValidParentheses(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();
        // TODO: iterate characters, push opens, pop & compare for closes
        return false;
    }
}


