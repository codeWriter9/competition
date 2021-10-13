package org.competition.leetcode.linkedlist;

public class AddTwoNumber {

    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        int carryOver = 0;
        ListNode head = null;
        ListNode current = null;
        ListNode save;
        while (l1 != null && l2 != null) {
            save = current;
            int result = carryOver + l1.val + l2.val;
            carryOver = result / 10;
            current = new ListNode(result % 10, null);
            if (save != null) {
                save.next = current;
            }
            if (head == null) {
                head = current;
            }
            System.out.println(current);
            //System.out.println(carryOver);
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            save = current;
            int result = carryOver + l1.val;
            carryOver = result / 10;
            current = new ListNode(result % 10, null);
            if (save != null) {
                save.next = current;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            save = current;
            int result = carryOver + l2.val;
            carryOver = result / 10;
            current = new ListNode(result % 10, null);
            if (save != null) {
                save.next = current;
            }
            l2 = l2.next;
        }
        while(carryOver > 0) {
            save = current;
            current = new ListNode(carryOver, null);
            save.next = current;
            carryOver = carryOver / 10;
            System.out.println(current);
        }
        return head;
    }
}