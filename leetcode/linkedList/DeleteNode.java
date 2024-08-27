package leetcode.linkedList;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        deleteDuplicates(node);
    }


    public void deleteDuplicates(ListNode head) {
        var current = head;
        var next = head.next;
        while(current != null && next != null){
            if(current.val == next.val){
                while (next != null && current.val == next.val){
                    next = next.next;
                }
                current.next = next;
            }
            current = next;
            if(current != null){
                next = current.next;
            }
        }
    }
}
