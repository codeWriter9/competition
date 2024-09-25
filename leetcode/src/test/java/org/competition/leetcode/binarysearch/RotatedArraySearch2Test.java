package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RotatedArraySearch2Test {

    private RotatedArraySearch2 rotatedArraySearch2;

    @Before
    public void setUp() {
        rotatedArraySearch2 = new RotatedArraySearch2();
    }

    @Test
    public void test() {
        assertTrue(rotatedArraySearch2.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        assertFalse(rotatedArraySearch2.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
        assertTrue(rotatedArraySearch2.search(new int[]{1}, 1));
        assertTrue(rotatedArraySearch2.search(new int[]{3, 3, 3, 1, 2, 3}, 1));
    }

    @After
    public void tearDown() {
        rotatedArraySearch2 = null;
    }
}
