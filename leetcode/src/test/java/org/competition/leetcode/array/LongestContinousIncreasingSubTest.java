package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LongestContinousIncreasingSubTest {

    private LongestContinousIncreasingSub longestContinousIncreasingSub;

    @Before
    public void before() {
        longestContinousIncreasingSub = new LongestContinousIncreasingSub();
    }

    @Test
    public void testLongestContinousIncreasingSub() {
        assertNotNull(longestContinousIncreasingSub);
        assertEquals(3, longestContinousIncreasingSub.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        assertEquals(1, longestContinousIncreasingSub.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }

    @After
    public void after() {
        longestContinousIncreasingSub = null;
    }
}
