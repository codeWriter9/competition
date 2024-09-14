package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeWaysTest {

    private DecodeWays decodeWays;

    @Before
    public void setUp() {
        decodeWays = new DecodeWays();
    }

    @Test
    public void test() {
        assertEquals(2, decodeWays.numDecodings("12"));
        assertEquals(3, decodeWays.numDecodings("226"));
        assertEquals(0, decodeWays.numDecodings("06"));
    }

    @After
    public void tearDown() {
        decodeWays = null;
    }
}
