package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 *
 * Brute Force - O(N) squared
 *
 *
 */
public class MaxSubArrayTest extends TestCase {

    private MaxSubArray maxSubArray;

    public MaxSubArrayTest(String name) {
        super(name);
        maxSubArray = new MaxSubArray();
    }

    public static Test suite() {
        return new TestSuite(MaxSubArrayTest.class);
    }

    public void testMaxSubArray() {
        Assert.assertNotNull(maxSubArray);
        long start = System.currentTimeMillis();
        Assert.assertEquals(6, maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        long end = System.currentTimeMillis();
        System.out.println("Time Taken:" + (end - start) + "milli secs:");
    }
}
