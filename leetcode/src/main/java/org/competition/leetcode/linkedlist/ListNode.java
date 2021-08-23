package org.competition.leetcode.linkedlist;

public class ListNode {

    private int val;
    private ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this();
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this(val);
        this.next = next;
    }

    ListNode next() {
        return next;
    }

    void next(ListNode next) {
        this.next = next;
    }

    public static ListNode list(int... values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = null;
        ListNode previous;
        for(int i=1;i<values.length;i++) {
            if(current == null) {
                current = new ListNode(values[i]);
                head.next = current;
            }
            else {
                previous = current;
                current = new ListNode(values[i]);
                previous.next = current;
            }
        }
        return head;
    }

    public static void print(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
