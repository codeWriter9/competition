package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
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
        assertEquals(asList(1), pascalTriangle.getRow(0));
        assertEquals(asList(1, 1), pascalTriangle.getRow(1));
        assertEquals(asList(1, 2, 1), pascalTriangle.getRow(2));
        assertEquals(asList(1, 3, 3, 1), pascalTriangle.getRow(3));
        assertEquals(asList(1, 4, 6, 4, 1), pascalTriangle.getRow(4));
        assertEquals(asList(1, 30, 435, 4060, 27405, 142506, 593775, 2035800, 5852925, 14307150, 30045015, 54627300, 86493225, 119759850, 145422675, 155117520, 145422675, 119759850, 86493225, 54627300, 30045015, 14307150, 5852925, 2035800, 593775, 142506, 27405, 4060, 435, 30, 1), pascalTriangle.getRow(30));
        assertEquals(asList(1, 31, 465, 4495, 31465, 169911, 736281, 2629575, 7888725, 20160075, 44352165, 84672315, 141120525, 206253075, 265182525, 300540195, 300540195, 265182525, 206253075, 141120525, 84672315, 44352165, 20160075, 7888725, 2629575, 736281, 169911, 31465, 4495, 465, 31, 1), pascalTriangle.getRow(31));
    }

    @After
    public void after() {
        pascalTriangle = null;
    }

}
