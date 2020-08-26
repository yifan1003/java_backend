package hw1.P1;

public class ReverseLinkedList {
    //Iterative
 public ListNode iterative(ListNode head) {
     ListNode pre = null;
     ListNode cur = head;
     while (cur != null) {
         ListNode next = cur.next;
         cur.next = pre;
         pre = cur;
         cur = next;
     }
     return pre;
 }
 public ListNode recursive(ListNode head) {
     if ( head == null || head.next == null) {
         return head;
     }
     ListNode tmp = recursive(head.next);
     head.next.next = head;
     head.next = null;
     return tmp;
 }
}
