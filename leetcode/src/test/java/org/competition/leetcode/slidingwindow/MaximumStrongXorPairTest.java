package org.competition.leetcode.slidingwindow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumStrongXorPairTest {

    private MaximumStrongXorPair maximumStrongXorPair;

    @Before
    public void setUp() throws Exception {
        maximumStrongXorPair = new MaximumStrongXorPair();
    }

    @Test
    public void testMaximumStrongXorPair() {
        assertNotNull(maximumStrongXorPair);
        assertEquals(7, maximumStrongXorPair.maximumStrongPairXor(new int[]{1,2,3,4,5}));
        assertEquals(0, maximumStrongXorPair.maximumStrongPairXor(new int[]{0}));
        assertEquals(7, maximumStrongXorPair.maximumStrongPairXor(new int[]{5,6,25,30}));
    }

    @After
    public void tearDown() throws Exception {
        maximumStrongXorPair = null;
    }
}
