package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
public class RelativeRanksTest {

    private RelativeRanks relativeRanks;

    @Before
    public void before() {
        relativeRanks = new RelativeRanks();
    }

    @Test
    public void testRelativeRanks() {
        assertNotNull(relativeRanks);
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, relativeRanks.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"}, relativeRanks.findRelativeRanks(new int[]{10, 3, 8, 9, 4}));
    }

    @After
    public void after() {
        relativeRanks = null;
    }

}
