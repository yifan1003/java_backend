package hw1.P1;

public class MyLinkedList {
    private int size;
    private ListNode dummyHead;

    public MyLinkedList() {
        size = 0;
        dummyHead = new ListNode();
    }
    public ListNode get(Integer index) {
        if (index < 0 || index >= size) {
            return null;
        }
        ListNode cur = dummyHead;
        for (int i = 0; i < index+1; i++) {
            cur = cur.next;
        }
        size++;
        return cur;
    }
    public void addAtHead(Integer val) {
        addAtIndex(0,val);
    }
    public void addAtTail(Integer val) {
        addAtIndex(size,val);
    }
    public void addAtIndex(int index, Integer val) {
        if (index > size) {
            return;
        }
        ListNode tmp = new ListNode(val);
        ListNode pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        tmp.next = pre.next;
        pre.next = tmp;
        size++;
    }public int getLength() {
        return size;
    }
    public void deleteNode(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode pre = dummyHead;
        for ( int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode tmp = pre.next;
        pre.next = tmp.next;
        size--;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        ListNode head = myLinkedList.get(0);
       //Test reverse LinkedList iterative
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode newHead = reverseLinkedList.iterative(head);
        ListNode newHead_ = newHead;
        while ( newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
        //Test reverse LinkedList recursive
        ListNode h = reverseLinkedList.recursive(newHead_);
        while ( h != null) {
            System.out.println(h.val);
            h = h.next;
        }
        //Test delete node
        DeleteNode deleteNode = new DeleteNode();
        ListNode myhead = deleteNode.deleteNode(head,4);
        while ( myhead != null) {
            System.out.println(myhead.val);
            myhead = myhead.next;
        }
        //Test find nth node;
        FindNthNode findNthNode = new FindNthNode();
        ListNode findNode = findNthNode.nthNode(head,2);
        System.out.println(findNode.val);
        //Test find nth node form end;
        FindNthNodeFromEnd findNthNodeFromEnd = new FindNthNodeFromEnd();
        ListNode myNode = findNthNodeFromEnd.NthNodeFromEnd(head,2);
        System.out.println(myNode.val);
    }
}
