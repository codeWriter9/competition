package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class ListNodeTest {

    private ListNode root;

    @Before
    public void before() {
        root = new ListNode(0, null);
    }

    @Test
    public void test() {
        assertNotNull(root);
        assertArrayEquals(new int[]{1, 2, 3, 4}, array(list(1, 2, 3, 4)));
    }

    @After
    public void after() {
        root = null;
    }

}
