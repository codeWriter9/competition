package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class PascalTriangleTest {

    private PascalTriangle pascalTriangle;

    @Before
    public void before() {
        pascalTriangle = new PascalTriangle();
    }

    @Test
    public void testPascalTriangle() {
        assertNotNull(pascalTriangle);
        assertArrayEquals(new Integer[]{1, 3, 3, 1}, pascalTriangle.getRow(3).toArray());
        assertArrayEquals(new Integer[]{1}, pascalTriangle.getRow(0).toArray());
        assertArrayEquals(new Integer[]{1, 1}, pascalTriangle.getRow(1).toArray());
    }

    @After
    public void after() {
        pascalTriangle = null;
    }
}
