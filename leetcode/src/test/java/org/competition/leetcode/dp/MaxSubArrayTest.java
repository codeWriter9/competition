package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class MaxSubArrayTest {

    private MaxSubArray maxSubArray;

    @Before
    public void before() {
        maxSubArray = new MaxSubArray();
    }

    public void testMaxSubArray() {
        Assert.assertNotNull(maxSubArray);
        long start = System.currentTimeMillis();
        Assert.assertEquals(6, maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        long end = System.currentTimeMillis();
        System.out.println("Time Taken:" + (end - start) + "milli secs:");
    }

    @After
    public void after() {
        maxSubArray = null;
    }
}