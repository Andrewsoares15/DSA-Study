package leetcode.linkedList;

public class BinaryLInkedList {

    public static void main(String[] args) {
        var head = getListNode();

        var next = head.next;
        head.next = null;
        head = reverseNodeByNode(head, next);

        System.out.println(head);
    }

    private static ListNode getListNode() {
        var head = new ListNode(1);
        var second = new ListNode(2);
        var thirth = new ListNode(3);
        var fourth = new ListNode(4);
        var fiveth = new ListNode(5);

        head.next = second;
        second.next = thirth;
        thirth.next = fourth;
        fourth.next = fiveth;
        return head;
    }

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

    public static ListNode reverseNodeByNode(ListNode previous, ListNode next){ // 1, 2 // 2, 3// 3, 4 // 4, 5

        if(next == null) return previous; // NO // NO// NO // NO
        System.out.println(previous.val + ",,,,,!" + next.val);
        var saveNext = next.next; // 3 // 4 // 5 // NULL

        next.next = previous; //  1 <- 2 // 2 <- 3 // 3 <- 4 // 4 <- 5

        return reverseNodeByNode(next, saveNext); // 2, 3// 3, 4 // 4, 5// 5, null
    }



}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

