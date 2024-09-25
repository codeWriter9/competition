package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumSortedTest {

    private TwoSumSorted twoSumSorted;

    @Before
    public void setUp() {
        twoSumSorted = new TwoSumSorted();
    }

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, twoSumSorted.twoSum(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSum(new int[]{-1, 0}, -1));
    }

    @After
    public void tearDown() {
        twoSumSorted = null;
    }
}
