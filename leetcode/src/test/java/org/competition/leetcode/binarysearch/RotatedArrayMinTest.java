package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotatedArrayMinTest {

    private RotatedArrayMin rotatedArrayMin;

    @Before
    public void setUp() {
        rotatedArrayMin = new RotatedArrayMin();
    }

    @Test
    public void test() {
        assertEquals(1, rotatedArrayMin.findMin(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, rotatedArrayMin.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(11, rotatedArrayMin.findMin(new int[]{11, 13, 15, 17}));
    }

    @After
    public void tearDown() {
        rotatedArrayMin = null;
    }
}
