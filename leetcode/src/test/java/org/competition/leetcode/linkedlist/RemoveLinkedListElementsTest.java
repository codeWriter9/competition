package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class RemoveLinkedListElementsTest {

    private RemoveLinkedListElements removeLinkedListElements;

    @Before
    public void before() {
        removeLinkedListElements = new RemoveLinkedListElements();
    }

    @Test
    public void testRemoveElementsNotNull() {
        assertNotNull(removeLinkedListElements);
        assertArrayEquals(null, array(removeLinkedListElements.removeElements(
                null, 3)));
    }

    @Test
    public void testRemoveElementsOnlyVal() {
        assertArrayEquals(null, array(removeLinkedListElements.removeElements(
                list(3, 3, 3), 3)));
    }

    @Test
    public void testRemoveElementsHeadVal() {
        assertArrayEquals(new int[]{1, 2}, array(removeLinkedListElements.removeElements(
                               list(3, 3, 3, 1, 2), 3)));
    }

    @Test
    public void testRemoveElementsMiddleVal() {
        assertArrayEquals(new int[]{1, 2, 4}, array(removeLinkedListElements.removeElements(
                list(1, 2, 3, 4), 3)));
    }

    @Test
    public void testRemoveElementsEndVal() {
        assertArrayEquals(new int[]{1, 2, 4}, array(removeLinkedListElements.removeElements(
                list(1, 2, 4, 3), 3)));
    }

    @After
    public void after() {
        removeLinkedListElements = null;
    }
}