package leetcode.linkedList;

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }if(head.next == null) {
            return head;
        }
        var slow = head;
        var fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
