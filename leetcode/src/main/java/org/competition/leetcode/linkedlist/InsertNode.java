package org.competition.leetcode.linkedlist;

/**
 *
 * Not Leet code problem - but a sub problem
 *
 *
 */
public class InsertNode {

    public ListNode insert(ListNode head, int x) {
        ListNode current = head;
        ListNode previous = null;
        while(current != null && current.val < x) {
            previous = current;
            current = current.next;
        }
        ListNode node = new ListNode(x);
        if(previous == null) { // if inserted at the begin
            node.next = head;
            head = node;
        }
        else { // if inserted at the middle or end
            previous.next = node;
            node.next = current;
        }
        return head;
    }
}
