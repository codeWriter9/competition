package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleOverlapTest {

    private RectangleOverlap rectangleOverlap;

    @Before
    public void setUp() throws Exception {
        rectangleOverlap = new RectangleOverlap();
    }

    @Test
    public void testIsRectangleOverlap() {
        assertNotNull(rectangleOverlap);
        assertTrue(rectangleOverlap.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
        assertFalse(rectangleOverlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));
        assertFalse(rectangleOverlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3}));
    }

    @After
    public void tearDown() throws Exception {
        rectangleOverlap = null;
    }
}
