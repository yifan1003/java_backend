package hw1.P1;

public class DeleteNode {
    public ListNode deleteNode(ListNode head, Integer val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null) {
//            ListNode next = head.next;
            if (head.val == val) {
                pre.next = head.next;
                break;
            }
            head = head.next;
            pre = pre.next;
        }
        return dummy.next;
    }
}
