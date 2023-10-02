package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LargestTriangleAreaTest {

    private LargestTriangleArea largestTriangleArea;

    @Before
    public void setUp() throws Exception {
        largestTriangleArea = new LargestTriangleArea();
    }

    @Test
    public void testLargestTriangleArea() throws Exception {
        assertNotNull(largestTriangleArea);
        assertEquals(2.00000, largestTriangleArea.largestTriangleArea(
                new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}), 0.001);
        assertEquals(0.50000, largestTriangleArea.largestTriangleArea(
                new int[][]{{1, 0}, {0, 0}, {0, 1}}), 0.001);
        assertEquals(5.5, largestTriangleArea.largestTriangleArea(
                new int[][]{{4,6}, {6,5}, {3,1}}), 0.001);

    }

    @After
    public void tearDown() throws Exception {
        largestTriangleArea = null;
    }
}
