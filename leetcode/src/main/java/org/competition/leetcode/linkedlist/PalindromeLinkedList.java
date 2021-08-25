package org.competition.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {


    public boolean isPalindrome(ListNode head) {
        List<Integer> copy = reverse(head, new ArrayList<>());
        System.out.println("copy="+copy);
        boolean isP = checkPalindrome(head, copy, 0);
        System.out.println("isP="+isP);
        return isP;
    }

    private boolean checkPalindrome(ListNode head, List<Integer> list, int index) {
        if(head != null && index < list.size()) {
            if(!list.get(index).equals(head.val())) return false;
            else return checkPalindrome(head.next(), list, index + 1);
        }
        return true;
    }

    private List<Integer> reverse(ListNode node, List<Integer> list) {
        if (node != null) {
            reverse(node.next(), list);
            list.add(node.val());
        }
        return list;
    }
}
