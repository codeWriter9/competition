package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MaxProductSubArrayTest {

    private MaxProductSubArray maxProductSubArray;

    @Before
    public void before() {
        maxProductSubArray = new MaxProductSubArray();
    }

    @Test
    public void testMaxSubProductArray() {
        assertNotNull(maxProductSubArray);
        assertEquals(0, maxProductSubArray.maxProduct(new int[]{0}));
        assertEquals(6, maxProductSubArray.maxProduct(new int[]{2, 3, -2, 4}));
        assertEquals(0, maxProductSubArray.maxProduct(new int[]{-2, 0, -1}));
        assertEquals(24, maxProductSubArray.maxProduct(new int[]{-2, 3, -4}));
    }

    @After
    public void after() {
        maxProductSubArray = null;
    }

}