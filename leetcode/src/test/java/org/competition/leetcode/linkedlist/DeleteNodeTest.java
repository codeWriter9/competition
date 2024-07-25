package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class DeleteNodeTest {

    private DeleteNode deleteNode;

    @Before
    public void setUp() throws Exception {
        deleteNode = new DeleteNode();
    }

    @Test
    public void test() {
        assertNotNull(deleteNode);
        assertArrayEquals(new int []{1, 2, 3, 5}, array(deleteNode.delete(list(1, 2, 3, 4, 5), 4)));
        assertArrayEquals(new int []{2, 3, 4, 5}, array(deleteNode.delete(list(1, 2, 3, 4, 5), 1)));
    }

    @After
    public void tearDown() throws Exception {
        deleteNode = null;
    }
}
