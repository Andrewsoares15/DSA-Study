package leetcode.linkedList;

import java.util.List;

public class RemoveDuplicatesLinkedList {

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.val = 1;
        ListNode list2 = new ListNode(2);
        list.next = list2;
        ListNode list3 = new ListNode(3);
        list2.next = list3;
        ListNode list4 = new ListNode(4);
        list3.next = list4;
        ListNode list5 = new ListNode(5);
        list4.next = list5;
        deleteDuplicates(list, 2, 4);
    }

    public static ListNode deleteDuplicates(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        var current = head;
        var next = head.next;
        while(current != null && next != null){
            if(next.val == left){
                System.out.println(next.val);
                next.next.next = next.next;
                current.next.next = current.next;
                current.next = next.next;

            }
            current = current.next;
            next = current.next;
        }
        return head;
    }
}
