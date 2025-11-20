import java.util.Scanner;

/**
 * Topic: Linked List Basics
 *
 * Q1. Create & traverse linked list
 *    - Beginner: manually link nodes, traverse with a pointer.
 *
 * Q2. Insert at head / tail
 *    - Beginner: adjust pointers carefully.
 *    - Optimized: use helper methods for O(1) insert.
 *
 * Q3. Delete a node
 *    - Beginner: find previous node then relink.
 *    - Optimized: two-pointer approach (prev + curr) to handle edge cases.
 */
public class LinkedListBasics {

    // Q1: Build a list from array input
    public static ListNode buildList(int[] values) {
        // TODO: create head and link nodes
        return null;
    }

    // Q2: Insert at head
    public static ListNode insertAtHead(ListNode head, int val) {
        // TODO: create new node whose next is head
        return head;
    }

    // Q2: Insert at tail
    public static ListNode insertAtTail(ListNode head, int val) {
        // TODO: if head null -> new node; else walk to tail and append
        return head;
    }

    // Q3: Delete first node with given value
    public static ListNode deleteNode(ListNode head, int target) {
        // TODO: use dummy + prev/curr pointers to remove matching node
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextInt();
        }
        ListNode head = buildList(vals);
        ListNode.printList(head);
        sc.close();
    }
}


