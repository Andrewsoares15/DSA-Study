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

}

