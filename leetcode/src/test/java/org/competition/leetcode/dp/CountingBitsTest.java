package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class CountingBitsTest {

    private CountingBits countingBits;

    @Before
    public void before() {
        countingBits = new CountingBits();
    }

    @Test
    public void testCountingBits() {
        assertNotNull(countingBits);
        assertArrayEquals(new int[]{0, 1, 1}, countingBits.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countingBits.countBits(5));
    }

    @After
    public void after() {
        countingBits = null;
    }

}