package org.competition.leetcode.binarysearch;

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

        assertEquals(4, hIndex.hIndex(new int[]{3, 4, 5, 10, 8}));
        assertEquals(3, hIndex.hIndex(new int[]{3, 3, 5, 8, 25}));
        assertEquals(2, hIndex.hIndex(new int[]{1, 3, 1}));
        assertEquals(1, hIndex.hIndex(new int[]{1}));

    }

    @After
    public void tearDown() {
        hIndex = null;
    }


}
