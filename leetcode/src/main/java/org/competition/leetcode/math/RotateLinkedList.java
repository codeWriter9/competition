package org.competition.leetcode.math;

import org.competition.leetcode.linkedlist.ListNode;

public class RotateLinkedList {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next() == null) return head;
        ListNode current = head;
        int n = 1;
        while(current.next() != null) {
            current = current.next();
            n++;
        }
        current.next(head);// cycle formed
        ListNode previous = head;
        for(int index=0;index<n - k % n - 1;index++) previous = previous.next();
        head = previous.next();// new head will be n - k % n;
        previous.next(null);
        return  head;
    }
}
