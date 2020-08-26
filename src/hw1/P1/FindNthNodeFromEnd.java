package hw1.P1;

public class FindNthNodeFromEnd {
    public ListNode NthNodeFromEnd(ListNode head, int n) {
        int s = 0;
        ListNode cur = head;
        while (cur != null) {
            s++;
            cur = cur.next;
        }
        int target = s - n;
        for (int i = 0; i < target; i++) {
            head = head.next;
        }
        return head;
    }
}
