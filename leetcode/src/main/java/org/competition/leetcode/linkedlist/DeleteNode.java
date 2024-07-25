package org.competition.leetcode.linkedlist;

public class DeleteNode {

    public ListNode delete(ListNode head, int x) {
        ListNode current = head;
        ListNode previous = null;
        while(current != null && current.val < x) {
            previous = current;
            current = current.next;
        }
        if(previous == null) { // if deleted at the begin
            head = head.next;
        }
        else { // if deleted at the middle or end
            previous.next = current.next;
        }
        return head;
    }

}
