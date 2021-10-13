package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class MiddleOfLinkedListTest {

    private MiddleOfLinkedList middleOfLinkedList;

    @Before
    public void before() {
        middleOfLinkedList = new MiddleOfLinkedList();
    }

    @Test
    public void testMiddleOfLinkedListNotNull() {
        assertNotNull(middleOfLinkedList);
    }

    @Test
    public void testMiddleOfLinkedList1() {
        assertArrayEquals(new int[]{3, 4, 5}, array(middleOfLinkedList.middleNode(list(1, 2, 3, 4, 5))));
    }

    @Test
    public void testMiddleOfLinkedList2() {
        assertArrayEquals(new int[]{4, 5, 6}, array(middleOfLinkedList.middleNode(list(1, 2, 3, 4, 5, 6))));
    }

    @After
    public void after() {
        middleOfLinkedList = null;
    }

}