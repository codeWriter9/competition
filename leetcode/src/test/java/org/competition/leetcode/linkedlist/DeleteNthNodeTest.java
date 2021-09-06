package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class DeleteNthNodeTest {

    private DeleteNthNode deleteNthNode;

    @Before
    public void before() {
        deleteNthNode = new DeleteNthNode();
    }

    @Test
    public void testDeleteNthNode() {
        assertNotNull(deleteNthNode);
        assertArrayEquals(new int[]{1, 2, 3, 5}, array(deleteNthNode.deleteNthNodeFromEnd(list(1, 2, 3, 4, 5), 2)));
        assertArrayEquals(new int[]{2}, array(deleteNthNode.deleteNthNodeFromEnd(list(1, 2), 2)));
        assertArrayEquals(new int[]{1}, array(deleteNthNode.deleteNthNodeFromEnd(list(1, 2), 1)));
    }

    @Test
    public void testDeleteNthNode2Pointer() {
        assertNotNull(deleteNthNode);
        assertArrayEquals(new int[]{1, 2, 3, 5}, array(deleteNthNode.twoPointerApproach(list(1, 2, 3, 4, 5), 2)));
        assertArrayEquals(new int[]{2}, array(deleteNthNode.twoPointerApproach(list(1, 2), 2)));
        assertArrayEquals(new int[]{1}, array(deleteNthNode.twoPointerApproach(list(1, 2), 1)));
    }

    @After
    public void after() {

    }

}