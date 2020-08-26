package hw1.P1;

public class ListNode {
    Integer val;
    ListNode next;
    public ListNode() {
        this(null,null);
    }
    public ListNode(Integer val) {
        this(val,null);
    }
    public ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
