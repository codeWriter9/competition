package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPerfectSquareTest {

    private ValidPerfectSquare validPerfectSquare;

    @Before
    public void setUp() throws Exception {
        validPerfectSquare = new ValidPerfectSquare();
    }

    @Test
    public void testValidPerfectSquare()  {
        assertNotNull(validPerfectSquare);
        assertTrue(validPerfectSquare.isPerfectSquare(16));
        assertTrue(validPerfectSquare.isPerfectSquare(4));
        assertFalse(validPerfectSquare.isPerfectSquare(14));
    }

    @After
    public void tearDown() throws Exception {
        validPerfectSquare = null;
    }
}
