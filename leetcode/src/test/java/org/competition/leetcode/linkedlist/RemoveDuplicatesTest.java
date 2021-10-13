package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates;

    @Before
    public void before() {
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    public void testRemoveDuplicates() {
        assertNotNull(removeDuplicates);
        assertArrayEquals(new int[]{1, 2, 3}, array(removeDuplicates.deleteDuplicates(list(1, 1, 2, 3, 3))));
        assertArrayEquals(new int[]{1, 2, 3}, array(removeDuplicates.deleteDuplicates(list(1, 2, 3))));
        assertArrayEquals(new int[]{1, 2, 3}, array(removeDuplicates.deleteDuplicates(list(1, 2, 2, 2, 3))));
    }

    @After
    public void after() {
        removeDuplicates = null;
    }

}
