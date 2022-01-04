package org.competition.leetcode.linkedlist;

public class ListNode {

    int val;
    ListNode next;

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

    public Integer val() {return this.val;}

    public ListNode next() {
        return next;
    }

    public void next(ListNode next) {
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

    public static int[] array(ListNode head) {
        if(head != null) {
            int count = 0;
            ListNode current = head;
            while(current!=null) {
                count++;
                current = current.next;
            }
            int [] array = new int[count];
            current = head;
            count = 0;
            while(current!=null) {
                array[count++] = current.val;
                current = current.next;
            }
            return array;
        }
        return null;
    }

    public static void print(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public String toString() {
        return "ListNode val=" + val;
    }
}
