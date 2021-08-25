package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.*;

public class CyclicLinkedListTest {

    private CyclicLinkedList cyclicLinkedList;

    @Before
    public void before() {
        cyclicLinkedList = new CyclicLinkedList();
    }

    @Test
    public void testCycle() {
        assertNotNull(cyclicLinkedList);
        assertTrue(cyclicLinkedList.hasCycle(node(5, 2)));
        assertTrue(cyclicLinkedList.hasCycle(node(10, 3)));
        assertFalse(cyclicLinkedList.hasCycle(list(1, 2, 3, 4)));
    }

    private ListNode node(int n, int r) {
        ListNode head = new ListNode(1);
        ListNode save = null;
        ListNode previous;
        ListNode current = head;
        for(int i =2;i<n+1;i++) {
            previous = current;
            current = new ListNode(i);
            previous.next(current);
            if(i == r) {
                save = current;
            }
        }
        current.next(save);
        return head;
    }

    @After
    public void after() {
        cyclicLinkedList = null;
    }
}