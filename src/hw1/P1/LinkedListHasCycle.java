package hw1.P1;

public class LinkedListHasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {return false;}
        if (head.next == null) {return false;}
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
