package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HIndexTest {

    private HIndex hIndex;

    @Before
    public void setUp() {
        hIndex = new HIndex();
    }

    @Test
    public void testHIndex() {
        assertEquals(4, hIndex.hIndex(new int[]{ 10, 8, 5, 4, 3}));
        assertEquals(4, hIndex.hIndex(new int[]{ 3, 4, 5, 10, 8}));
        assertEquals(3, hIndex.hIndex(new int[]{ 25, 8, 5, 3, 3}));
        assertEquals(3, hIndex.hIndex(new int[]{ 3, 3, 5, 8, 25}));
        assertEquals(3, hIndex.hIndex(new int[]{ 5, 6, 1, 0, 3}));
        assertEquals(1, hIndex.hIndex(new int[]{ 1, 3, 1}));
    }


    @After
    public void tearDown() {
        hIndex = null;
    }
}
