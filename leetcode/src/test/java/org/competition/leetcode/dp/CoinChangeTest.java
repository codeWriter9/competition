package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CoinChangeTest {

    private CoinChange coinChange;

    @Before
    public void setUp() throws Exception {
        coinChange = new CoinChange();
    }

    @Test
    public void test() {
        assertNotNull(coinChange);
        int amount = 11;
        int [] dp = new int[amount + 1];
        System.out.println(coinChange.func(new int[]{1, 2, 5}, amount, dp));
        assertEquals(3, coinChange.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));
        assertEquals(0, coinChange.coinChange(new int[]{1}, 0));
    }

    @After
    public void destroy() throws Exception {
        coinChange = null;
    }
}
