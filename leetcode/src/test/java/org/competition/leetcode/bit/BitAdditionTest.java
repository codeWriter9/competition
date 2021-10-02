package org.competition.leetcode.bit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitAdditionTest {

    private BitAddition bitAddition;

    @Before
    public void before() {
        bitAddition = new BitAddition();
    }

    @Test
    public void testBitAddition() {
        assertEquals(3, bitAddition.add(0b10, 0b1));
        assertEquals(55, bitAddition.add(0b1, 0b10, 0b11, 0b100, 0b101, 0b110, 0b111, 0b1000, 0b1001, 0b1010));
    }

    @Test
    public void testBitOr() {
        assertEquals(3, bitAddition.or(0b10, 0b1));
        assertEquals(7, bitAddition.or(0b1, 0b10, 0b11, 0b100, 0b101, 0b110, 0b111));
        assertEquals(15, bitAddition.or(0b1, 0b10, 0b11, 0b100, 0b101, 0b110, 0b111, 0b1000, 0b1001, 0b1010));
    }

    @Test
    public void testSumOfBits() {
        assertEquals(0, bitAddition.sumOfBits(0b0));
        assertEquals(1, bitAddition.sumOfBits(0b1));
        assertEquals(1, bitAddition.sumOfBits(0b10));
        assertEquals(2, bitAddition.sumOfBits(0b11));
        assertEquals(1, bitAddition.sumOfBits(0b100));
    }

    @After
    public void after() {
        bitAddition = null;
    }
}
