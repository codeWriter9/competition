package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class MergeSortedListTest {

    private MergeSortedList mergeSortedList;

    @Before
    public void before() {
        mergeSortedList = new MergeSortedList();
    }

    @Test
    public void test() {
        assertNotNull(mergeSortedList);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array(mergeSortedList.mergeTwoLists(list(1, 3, 5), list(2, 4, 6))));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array(mergeSortedList.mergeTwoLists(list(1, 2, 3), list(4, 5, 6))));
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, array(mergeSortedList.mergeTwoLists(list(1, 2, 4), list(1, 3, 4))));
    }

    @After
    public void after() {
        mergeSortedList = null;
    }
}
