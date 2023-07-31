package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MaxAverageSubArrayTest {

    private MaxAverageSubArray maxAverageSubArray;

    @Before
    public void setUp() throws Exception {
        maxAverageSubArray = new MaxAverageSubArray();
    }

    @Test
    public void testMaxAverageSubArray() {
        assertNotNull(maxAverageSubArray);
        assertEquals(12.75, maxAverageSubArray.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 0.0);
        assertEquals(5.0, maxAverageSubArray.findMaxAverage(new int[]{5}, 1), 0.0);
    }

    @After
    public void tearDown() throws Exception {
        maxAverageSubArray = null;
    }
}
