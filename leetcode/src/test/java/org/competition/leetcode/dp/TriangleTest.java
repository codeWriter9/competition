package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void before() {
        triangle = new Triangle();
    }

    @Test
    public void testTriangleNotNull() {
        assertNotNull(triangle);
    }

    @Test
    public void testTriangle1() {
        assertEquals(-10, triangle.minimumTotal(asList(asList(-10))));
    }

    @Ignore
    public void testTriangle2() {
        assertEquals(-10, triangle.minimumTotal(asList(asList(2), asList(3, 4), asList(6, 5, 7), asList(4, 1, 8, 3))));
    }

    @After
    public void after() {
        triangle = null;
    }

}