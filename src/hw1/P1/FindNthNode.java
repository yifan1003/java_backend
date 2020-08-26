package hw1.P1;

public class FindNthNode {
    public ListNode nthNode(ListNode head, int n) {
        for (int i = 0; i < n-1; i++) {
            head = head.next;
        }
        return head;
    }
}
