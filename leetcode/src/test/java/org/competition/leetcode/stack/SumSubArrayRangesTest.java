package org.competition.leetcode.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumSubArrayRangesTest {

    private SumSubArrayRanges sumSubArrayRanges;

    @Before
    public void setUp() {
        sumSubArrayRanges = new SumSubArrayRanges();
    }

    @Test
    public void test() {
        assertEquals(4, sumSubArrayRanges.subArrayRanges(new int[]{1, 2, 3}));
        System.out.println("=====================================");
        assertEquals(4, sumSubArrayRanges.subArrayRanges(new int[]{1, 3, 3}));
        System.out.println("=====================================");
        assertEquals(59, sumSubArrayRanges.subArrayRanges(new int[]{4, -2, -3, 4, 1}));
    }

    @After
    public void tearDown() {
        sumSubArrayRanges = null;
    }
}
