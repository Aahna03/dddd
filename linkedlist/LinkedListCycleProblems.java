/**
 * Topic: Intermediate Linked Lists
 *
 * Q6. Detect cycle (Floyd’s algorithm)
 *    - Beginner: use HashSet to store visited nodes.
 *    - Optimized: fast/slow pointers (tortoise-hare) for O(1) space.
 *
 * Q7. Remove cycle
 *    - Beginner: after detection, manually scan to break loop.
 *    - Optimized: find cycle start using Floyd’s meeting point, then disconnect.
 */
public class LinkedListCycleProblems {

    // Q6: Detect cycle using HashSet (beginner)
    public static boolean hasCycleHashing(ListNode head) {
        // TODO: use Set<ListNode> to track visited nodes
        return false;
    }

    // Q6: Detect cycle using Floyd's algorithm
    public static boolean hasCycleFloyd(ListNode head) {
        // TODO: use slow/fast pointers
        return false;
    }

    // Q7: Remove cycle once detected using Floyd's algorithm
    public static void removeCycle(ListNode head) {
        // TODO: detect meeting point, find start of cycle, break link
    }
}


