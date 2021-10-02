package org.competition.leetcode.bit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.toBinaryString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReverseBitTest {

    private ReverseBit reverseBit;

    @Before
    public void before() {
        reverseBit = new ReverseBit();
    }

    @Test
    public void testReverseBits() {
        assertNotNull(reverseBit);
        assertEquals(964176192, (reverseBit.reverseBits(0b00000010100101000001111010011100)));
        assertEquals(-1073741825, (reverseBit.reverseBits(0b11111111111111111111111111111101)));
    }

    @After
    public void after() {
        reverseBit = null;
    }
}