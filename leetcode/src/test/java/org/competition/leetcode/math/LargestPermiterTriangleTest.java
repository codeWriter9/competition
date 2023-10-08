package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LargestPermiterTriangleTest {

    private LargestPermiterTriangle largestPermiterTriangle;

    @Before
    public void setUp() throws Exception {
        largestPermiterTriangle = new LargestPermiterTriangle();
    }

    @Test
    public void test() {
        assertNotNull(largestPermiterTriangle);
        assertEquals(5, largestPermiterTriangle.largestPerimeter(new int[]{2, 1, 2}));
        assertEquals(0, largestPermiterTriangle.largestPerimeter(new int[]{1, 2, 1}));
        assertEquals(10, largestPermiterTriangle.largestPerimeter(new int[]{3, 2, 3, 4}));
    }

    @After
    public void destroy()   {
        largestPermiterTriangle = null;
    }
}
