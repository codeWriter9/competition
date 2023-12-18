package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UniqueCombinationSumTest {

    private UniqueCombinationSum uniqueCombinationSum;

    @Before
    public void setUp() {
        uniqueCombinationSum = new UniqueCombinationSum();
    }

    @Test
    public void test() {
        assertNotNull(uniqueCombinationSum);
        assertEquals(asList(
                        asList(1, 2, 2), asList(5)
                ),
                uniqueCombinationSum.combinationSum2(new int[]{2,5,2,1,2}, 5));
        assertEquals(asList(
                        asList(1, 1, 6),  asList(1, 2, 5), asList(1, 7), asList(2, 6)
                ),
                uniqueCombinationSum.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }

    @After
    public void after() {
        uniqueCombinationSum = null;
    }
}
