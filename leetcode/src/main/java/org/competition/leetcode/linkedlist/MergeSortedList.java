package org.competition.leetcode.linkedlist;

public class MergeSortedList {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        return merge(list1, list2, null, null);
    }

    private ListNode merge(ListNode list1, ListNode list2, ListNode head, ListNode tail) {
        if(list1 == null && list2 == null) return head;
        if(list1 == null) {
            tail.next(list2);
            return head;
        }
        else if(list2 == null) {
            tail.next(list1);
            return head;
        }
        if(list1.val() >= list2.val()) {
            return getListNode(list1, list2, head, tail, list2.next());
        }
        else {
            return getListNode(list1.next(), list1, head, tail, list2);
        }
    }

    private ListNode getListNode(ListNode list1, ListNode list2, ListNode head, ListNode tail, ListNode next) {
        if (head == null) {
            head = list2;
        } else {
            tail.next(list2);
        }
        tail = list2;
        return merge(list1, next, head, tail);
    }
}
