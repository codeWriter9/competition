package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumbersTest {

    private HappyNumbers happyNumbers;

    @Before
    public void before() {
        happyNumbers = new HappyNumbers();
    }

    @Test
    public void testHappyNumberTest() {
        assertNotNull(happyNumbers);
        assertTrue(happyNumbers.isHappy(19));
        assertFalse(happyNumbers.isHappy(2));
    }

    @After
    public void after() {
        happyNumbers = null;
    }

}