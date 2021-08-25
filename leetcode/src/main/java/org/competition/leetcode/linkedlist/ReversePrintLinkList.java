package org.competition.leetcode.linkedlist;

public class ReversePrintLinkList {

    public String reversePrint(ListNode head) {
        return reverse(head, new StringBuilder()).toString();
    }

    private StringBuilder reverse(ListNode head, StringBuilder builder) {
        if(head != null) {
            reverse(head.next(), builder);
            builder.append(head.val());
        }
        return builder;
    }
}
