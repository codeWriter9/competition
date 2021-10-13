package org.competition.leetcode.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.linkedlist.ListNode.array;
import static org.competition.leetcode.linkedlist.ListNode.list;
import static org.junit.Assert.*;

public class AddTwoNumberTest {

    private AddTwoNumber addTwoNumber;

    @Before
    public void begin() {
        addTwoNumber = new AddTwoNumber();
    }

    @Test
    public void testAddTwoNumber() {
        assertNotNull(addTwoNumber);
        assertArrayEquals(array(list(7, 0, 8)), array(addTwoNumber.addTwoNumber(list(2, 4, 3), list(5, 6, 4))));
        assertArrayEquals(array(list(0, 0, 0, 1)), array(addTwoNumber.addTwoNumber(list(1, 1, 1), list(9, 8, 8))));
        assertArrayEquals(array(list(8, 9, 9, 9, 0, 0, 0, 1)), array(addTwoNumber.addTwoNumber(list(9, 9, 9, 9, 9, 9, 9), list(9, 9, 9, 9))));
    }

    @After
    public void after() {
        addTwoNumber = null;
    }

}