package org.competition.leetcode.linkedlist;

import java.util.List;

/**
 *
 *
 *
 *
 */
public class ReverseLinked {

    public ListNode reverse(ListNode head) {
        if(head !=  null) {
            ListNode current = head;
            ListNode previous = null;
            ListNode save;
            while(current != null) {
                save = previous; // save the last previous
                previous = current; // save the last current in previous
                current = current.next();// increment current forward 1 step
                previous.next(save);// set the pointer of last to last previous in previous
            }
            return previous;
        }
        return head;
    }
}
