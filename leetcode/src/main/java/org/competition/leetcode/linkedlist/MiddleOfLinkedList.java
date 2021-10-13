package org.competition.leetcode.linkedlist;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        ListNode current = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }
        current = head;
        count = count / 2;
        while(count > 0) {
            count--;
            current = current.next;
        }
        return current;
    }
}
