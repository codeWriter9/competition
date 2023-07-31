package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RangeAdditionTest {

    private RangeAddition rangeAddition;

    @Before
    public void setUp() {
        rangeAddition = new RangeAddition();
    }

    @Test
    public void testRangeAddition() {
        assertNotNull(rangeAddition);
        assertEquals(4, rangeAddition.maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
        assertEquals(4, rangeAddition.maxCount(3, 3, new int[][]{{2, 2},{3, 3},{3, 3},{3, 3},{2, 2},{3, 3},{3, 3},{3, 3},{2, 2},{3, 3},{3, 3},{3, 3}}));
        assertEquals(9, rangeAddition.maxCount(3, 3, new int[][]{}));
    }

    @After
    public void destroy() {
        rangeAddition = null;
    }
}
