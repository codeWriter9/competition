package org.competition.leetcode.recursive;

import org.competition.leetcode.linkedlist.ListNode;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class SwapNodesTest {

    private SwapNodes swapNodes;

    @Before
    public void before() {
        swapNodes = new SwapNodes();
    }

    @Test
    public void testSwapNodes() {
        ListNode head = list(1, 2, 3, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, array(head));
        assertArrayEquals(new int[]{2, 1, 4, 3}, array(swapNodes.swapPairs(head)));
    }

    @Test
    public void testSwapNodesOdd() {
        ListNode head = list(1, 2, 3, 4, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array(head));
        assertArrayEquals(new int[]{2, 1, 4, 3, 5}, array(swapNodes.swapPairs(head)));
    }

    @Test
    public void testSwapNodesEmpty() {
        assertNull(swapNodes.swapPairs(null));
    }

    @Test
    public void testSwapNodesSingleton() {
        ListNode head = list(1);
        assertArrayEquals(new int[]{1}, array(head));
        assertArrayEquals(new int[]{1}, array(swapNodes.swapPairs(head)));
    }

    @After
    public void after() {
        swapNodes = null;
    }

}
