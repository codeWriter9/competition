package org.competition.leetcode.recursive;

import org.competition.leetcode.linkedlist.ListNode;

public class SwapNodes {

    public ListNode swapPairs(ListNode head) {
        return swap(head);
    }

    private ListNode swap(ListNode head) {
        if(head == null || head.next() == null) return head;// if last node or null
        ListNode tempHead = swap(head.next().next());// point to rest of the List
        ListNode temp = head.next();// save head next
        head.next(tempHead);// head points to rest
        temp.next(head);// head next points to head
        head = temp;// head next is new head
        return head;
    }
}
