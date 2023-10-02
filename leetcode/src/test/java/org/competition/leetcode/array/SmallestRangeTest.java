package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SmallestRangeTest {

    private SmallestRange smallestRange;

    @Before
    public void setUp() throws Exception {
        smallestRange = new SmallestRange();
    }

    @Test
    public void smallestRangeTest() {
        assertNotNull(smallestRange);
        assertEquals(0, smallestRange.smallestRangeI(new int[]{1}, 0));
        assertEquals(6, smallestRange.smallestRangeI(new int[]{0, 10}, 2));
        assertEquals(0, smallestRange.smallestRangeI(new int[]{1, 3, 6}, 3));
    }

    @After
    public void tearDown() throws Exception {
        smallestRange = null;
    }
}
