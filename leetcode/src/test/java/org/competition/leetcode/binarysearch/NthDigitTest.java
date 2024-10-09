package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthDigitTest {

    private NthDigit nthDigit;

    @Before
    public void before() {
        nthDigit = new NthDigit();
    }

    @Test
    public void test() {
        System.out.println("--------------------");
        assertEquals(3, nthDigit.findNthDigit(3));
        System.out.println("--------------------");
        assertEquals(0, nthDigit.findNthDigit(11));
        System.out.println("--------------------");
        assertEquals(1, nthDigit.findNthDigit(13));
        System.out.println("--------------------");
        assertEquals(2, nthDigit.findNthDigit(2147483647));
        System.out.println("--------------------");
        assertEquals(1, nthDigit.findNthDigit(1000000000));
        System.out.println("--------------------");

    }

    @After
    public void after() {
        nthDigit = null;
    }
}
