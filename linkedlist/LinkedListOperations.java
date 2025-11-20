/**
 * Topic: Linked List Operations
 *
 * Q4. Reverse a linked list
 *    - Beginner: copy values to array then rebuild list.
 *    - Optimized: in-place reversal with prev/curr/next pointers.
 *
 * Q5. Find middle of linked list
 *    - Beginner: count nodes then move to middle index.
 *    - Optimized: fast & slow pointers (tortoise-hare).
 */
public class LinkedListOperations {

    // Q4: Reverse by copying values (not space-efficient)
    public static ListNode reverseByArray(ListNode head) {
        // TODO: store values in array/list, then rebuild linked list
        return head;
    }

    // Q4: Reverse in-place using three pointers
    public static ListNode reverseInPlace(ListNode head) {
        // TODO: iterate with prev, curr, next
        return head;
    }

    // Q5: Find middle by counting length
    public static ListNode middleByCounting(ListNode head) {
        // TODO: first count nodes, then iterate length/2 steps
        return head;
    }

    // Q5: Find middle using slow/fast pointers
    public static ListNode middleByTwoPointers(ListNode head) {
        // TODO: advance slow by 1, fast by 2
        return head;
    }
}


