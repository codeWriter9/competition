package org.competition.leetcode.math;

import org.competition.leetcode.linkedlist.ListNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class RotateLinkedListTest {

    private RotateLinkedList rotateLinkedList;

    @Before
    public void before() {
        rotateLinkedList = new RotateLinkedList();
    }

    @Test
    public void test() {
        assertTrue(compare(ListNode.list(4, 5, 1, 2, 3),
                rotateLinkedList.rotateRight(ListNode.list(1, 2, 3, 4, 5), 2)));
        assertTrue(compare(ListNode.list(2, 0, 1),
                rotateLinkedList.rotateRight(ListNode.list(0, 1, 2), 4)));
    }

    private boolean compare(ListNode expected, ListNode returnNode) {
        boolean result = true;
        while(expected != null && returnNode != null) {
            if(expected.val() != returnNode.val()) {
                result = false;
                break;
            }
            expected = expected.next();
            returnNode = returnNode.next();
        }
        return result;
    }

    @After
    public void after() {
        rotateLinkedList = null;
    }
}
