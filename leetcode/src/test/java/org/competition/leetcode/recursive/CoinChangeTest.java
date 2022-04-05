package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CoinChangeTest {

    private CoinChange coinChange;

    @Before
    public void setUp() {
        coinChange = new CoinChange();
    }

    @Test
    public void testCoinChange() {
        assertNotNull(coinChange);
        assertEquals(3, coinChange.coinChange(new int[]{1, 2, 5}, 11));
    }

    @After
    public void after() {
        coinChange = null;
    }
}
