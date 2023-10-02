package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class FairCandySwapTest {
    private FairCandySwap fairCandySwap;

    @Before
    public void setUp() throws Exception {
        fairCandySwap = new FairCandySwap();
    }

    @Test
    public void testFairCandySwap() throws Exception {
        assertNotNull(fairCandySwap);
        assertArrayEquals(new int[]{1, 2}, fairCandySwap.fairCandySwap(new int[]{1, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{1, 2}, fairCandySwap.fairCandySwap(new int[]{1, 2}, new int[]{2, 3}));
        assertArrayEquals(new int[]{2, 3}, fairCandySwap.fairCandySwap(new int[]{2}, new int[]{1, 3}));
    }

    @After
    public void tearDown() throws Exception {
        fairCandySwap = null;
    }
}
