/**
 * Simple singly linked list node used across linked list practice files.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode fromArray(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int v : values) {
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }
}


