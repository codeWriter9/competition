package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CombinationSumTest {

    private CombinationSum combinationSum;

    @Before
    public void setUp() {
        combinationSum = new CombinationSum();
    }

    @Test
    public void test1() {
        assertNotNull(combinationSum);
        assertEquals(Arrays.asList(), combinationSum.combinationSum1(new int[]{2}, 1));
        assertEquals(Arrays.asList(
                Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3)
                , Arrays.asList(3, 5)
        ), combinationSum.combinationSum1(new int[]{2, 3, 5}, 8));
        assertEquals(Arrays.asList(
                Arrays.asList(2, 2, 3), Arrays.asList(7)
        ), combinationSum.combinationSum1(new int[]{2, 3, 6, 7}, 7));


    }

    @Test
    public void test() {
        assertNotNull(combinationSum);
        assertEquals(Arrays.asList(), combinationSum.combinationSum(new int[]{2}, 1));
        assertEquals(Arrays.asList(
                Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3)
                , Arrays.asList(3, 5)
        ), combinationSum.combinationSum(new int[]{2, 3, 5}, 8));
        assertEquals(Arrays.asList(
                Arrays.asList(2, 2, 3), Arrays.asList(7)
        ), combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));


    }

    @After
    public void destroy() {
        combinationSum = null;
    }
}
