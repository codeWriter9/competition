package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence longestIncreasingSubsequence;

    @Before
    public void setUp() {
        longestIncreasingSubsequence = new LongestIncreasingSubsequence();
    }

    @Test
    public void test() {
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
        assertEquals(3, longestIncreasingSubsequence.lengthOfLIS(new int[]{4, 10, 4, 3, 8, 9}));
        assertEquals(6, longestIncreasingSubsequence.lengthOfLIS(new int[]{3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12}));

    }

    @After
    public void destroy() {
        longestIncreasingSubsequence = null;
    }
}
