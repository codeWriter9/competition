package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumPathSumTest {
    private MinimumPathSum minimumPathSum;

    @Before
    public void setUp() throws Exception {
        minimumPathSum = new MinimumPathSum();
    }

    @Test
    public void test() {
        assertEquals(7, minimumPathSum.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        assertEquals(12, minimumPathSum.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    @After
    public void tearDown() throws Exception {
        minimumPathSum = null;
    }
}
