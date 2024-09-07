package org.competition.leetcode.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfSubArrayMinTest {

    private SumOfSubArrayMin sumOfSubArrayMin;

    @Before
    public void setUp() {
        sumOfSubArrayMin = new SumOfSubArrayMin();
    }

    @Test
    public void test() {
        assertEquals(17, sumOfSubArrayMin.sumSubarrayMins(new int[]{3, 1, 2, 4}));
        assertEquals(444, sumOfSubArrayMin.sumSubarrayMins(new int[]{11, 81, 94, 43, 3}));

    }

    @After
    public void tearDown() {
        sumOfSubArrayMin = null;
    }
}
