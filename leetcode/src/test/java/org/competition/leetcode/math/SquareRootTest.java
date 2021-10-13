package org.competition.leetcode.math;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SquareRootTest {

    private SquareRoot squareRoot;

    @Before
    public void before() {
        squareRoot = new SquareRoot();
    }

    @Test
    public void testSquareRoot() {
        assertNotNull(squareRoot);
        assertEquals(0, squareRoot.mySqrt(0));
        assertEquals(1, squareRoot.mySqrt(1));
        assertEquals(1, squareRoot.mySqrt(2));
        assertEquals(1, squareRoot.mySqrt(3));
        assertEquals(2, squareRoot.mySqrt(4));
        assertEquals(2, squareRoot.mySqrt(5));
        assertEquals(2, squareRoot.mySqrt(6));
        assertEquals(2, squareRoot.mySqrt(7));
        assertEquals(2, squareRoot.mySqrt(8));
        assertEquals(3, squareRoot.mySqrt(9));
        assertEquals(3, squareRoot.mySqrt(10));
        assertEquals(13
                , squareRoot.mySqrt(172));
        assertEquals(46340
                , squareRoot.mySqrt(2147483647));
    }

    @After
    public void after() {
        squareRoot = null;
    }
}