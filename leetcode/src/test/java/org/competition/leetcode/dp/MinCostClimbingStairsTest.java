package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCostClimbingStairsTest {

    private MinCostClimbingStairs minCostClimbingStairs;

    @Before
    public void before() {
        minCostClimbingStairs = new MinCostClimbingStairs();
    }

    @Test
    public void testMinCostClimbingStairs() {
        assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @After
    public void after() {
        minCostClimbingStairs = null;
    }

}
