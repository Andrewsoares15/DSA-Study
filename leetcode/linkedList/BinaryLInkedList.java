package leetcode.linkedList;

public class BinaryLInkedList {

    static int getbinary(ListNode head) {
        String decimalNum = String.valueOf(head.val);
        while (head.next != null) {
            decimalNum = decimalNum.concat(String.valueOf(head.next.val));
            head = head.next;
        }
        return Integer.parseInt(decimalNum, 2);
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        while (list1.next != null || list2.next != null) {

        }

        return result;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

