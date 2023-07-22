package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PerfectNumberTest {

    PerfectNumber perfectNumber;

    @Before
    public void before() {
        perfectNumber = new PerfectNumber();
    }

    @Test
    public void testPerfectNumber() {
        assertNotNull(perfectNumber);
        assertTrue(!perfectNumber.checkPerfectNumber(1));
        assertTrue(!perfectNumber.checkPerfectNumber(2));
        assertTrue(!perfectNumber.checkPerfectNumber(3));
        assertTrue(!perfectNumber.checkPerfectNumber(2016));
        assertTrue(perfectNumber.checkPerfectNumber(6));
        assertTrue(perfectNumber.checkPerfectNumber(28));
        assertTrue(!perfectNumber.checkPerfectNumber(99999999));

    }

    @After
    public void after() {
        perfectNumber = null;
    }
}
