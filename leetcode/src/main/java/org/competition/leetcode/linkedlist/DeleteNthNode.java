package org.competition.leetcode.linkedlist;

public class DeleteNthNode {

    public ListNode twoPointerApproach(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;
        for(int i=0;i<n+1;i++) {
            first = first.next();// measure N steps
        }

        while(first != null) {
            first = first.next();// measure till end
            second = second.next();// will go from (end - N)
        }
        second.next(second.next().next());
        return dummy.next();
    }

    public ListNode deleteNthNodeFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next(head);
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next();
        }
        length = length - n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next();
        }
        first.next(first.next().next());
        return dummy.next();
    }
}
