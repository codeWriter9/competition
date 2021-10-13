package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MaxInGeneratedArrayTest {

    private MaxInGeneratedArray maxInGeneratedArray;

    @Before
    public void before() {
        maxInGeneratedArray = new MaxInGeneratedArray();
    }

    @Test
    public void testMaxInGeneratedArray() {
        assertNotNull(maxInGeneratedArray);
        assertEquals(3, maxInGeneratedArray.getMaximumGenerated(7));
        assertEquals(1, maxInGeneratedArray.getMaximumGenerated(2));
        assertEquals(2, maxInGeneratedArray.getMaximumGenerated(3));
    }

    @After
    public void after() {
        maxInGeneratedArray = null;
    }
}