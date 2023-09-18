package leetcode.linkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null) {
            return head;
        }

        ListNode prev = null;
        var current = head;
        var next = head.next;
        while(current != null){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
