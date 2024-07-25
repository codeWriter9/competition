package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class InsertNodeTest {

    private InsertNode insertNode;

    @Before
    public void setUp() throws Exception {
        insertNode = new InsertNode();
    }

    @Test
    public void test() {
        assertNotNull(insertNode);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array(insertNode.insert(list(1, 2, 3, 5), 4)));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, array(insertNode.insert(list(1, 2, 3, 4), 0)));
    }

    @After
    public void tearDown() throws Exception {
        insertNode = null;
    }
}
