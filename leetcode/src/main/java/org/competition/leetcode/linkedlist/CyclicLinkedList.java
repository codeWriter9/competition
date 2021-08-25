package org.competition.leetcode.linkedlist;

public class CyclicLinkedList {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next() == null) return false;
        ListNode slow = head;
        ListNode fast = head.next();
        while(slow != fast) {
            if(fast == null || fast.next() == null) return false;// we reached end without slow and fast at same node
            fast = fast.next().next();
            slow = slow.next();
        }
        return true;// we broke out of loop as somewhere fast was equal to slow so has cycle
    }

}
