package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TribonacciTest {

    private Tribonacci tribonacci;

    @Before
    public void before() {
        tribonacci = new Tribonacci();
    }

    @Test
    public void testTribonacci() {
        assertEquals(0, tribonacci.tribonacci(0));
        assertEquals(1, tribonacci.tribonacci(1));
        assertEquals(1, tribonacci.tribonacci(2));
        assertEquals(2, tribonacci.tribonacci(3));
        assertEquals(4, tribonacci.tribonacci(4));
        assertEquals(7, tribonacci.tribonacci(5));
        assertEquals(13, tribonacci.tribonacci(6));
        assertEquals(29249425
                , tribonacci.tribonacci(30));
        assertEquals(1132436852
                , tribonacci.tribonacci(36));
        assertEquals(2082876103
                , tribonacci.tribonacci(37));
    }

    @After
    public void after() {
        tribonacci = null;
    }

}
