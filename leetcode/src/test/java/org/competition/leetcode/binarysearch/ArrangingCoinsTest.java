package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrangingCoinsTest {

    private ArrangingCoins arrangingCoins;

    @Before
    public void setUp() {
        arrangingCoins = new ArrangingCoins();
    }

    @Test
    public void testArrangingCoins() {
        long start = System.currentTimeMillis();
        assertEquals(2, arrangingCoins.arrangeCoins(5));
        assertEquals(3, arrangingCoins.arrangeCoins(8));
        assertEquals(65535, arrangingCoins.arrangeCoins(Integer.MAX_VALUE - 10));
        long end = System.currentTimeMillis();
        System.out.println("Time taken for arrangeCoins [loop] : " + (end - start) + "ms");

        start = System.currentTimeMillis();
        assertEquals(2, arrangingCoins.arrangeCoinsBinarySearch(5));
        assertEquals(3, arrangingCoins.arrangeCoinsBinarySearch(8));
        assertEquals(65535, arrangingCoins.arrangeCoinsBinarySearch(Integer.MAX_VALUE - 10));
        end = System.currentTimeMillis();
        System.out.println("Time taken for arrangeCoins [binary search]: " + (end - start) + "ms");
    }

    @After
    public void tearDown() {
        arrangingCoins = null;
    }
}
