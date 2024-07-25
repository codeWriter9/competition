package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RemoveDuplicates2Test {

    private RemoveDuplicates2 removeDuplicates2;

    @Before
    public void before() {
        removeDuplicates2 = new RemoveDuplicates2();
    }

    @Test
    public void test() {
        assertNotNull(removeDuplicates2);
        assertEquals(5, removeDuplicates2.removeDuplicates(new int[]{1, 1, 1, 1, 2, 2, 3}));
        assertEquals(7, removeDuplicates2.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    @After
    public void after() {
        removeDuplicates2 = null;
    }
}
