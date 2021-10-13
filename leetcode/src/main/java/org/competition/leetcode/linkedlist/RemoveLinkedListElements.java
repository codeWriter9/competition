package org.competition.leetcode.linkedlist;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        if(head.val == val) head = removeElements(head.next, val);
        else head.next = removeElements(head.next, val);
        return head;
    }

}