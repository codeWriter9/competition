package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BuySellStockTest {

    private BuySellStock buySellStock;

    @Before
    public void before() {
        buySellStock = new BuySellStock();
    }

    @Test
    public void testBuySellStock() {
        assertNotNull(buySellStock);
        assertEquals(7, buySellStock.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(4, buySellStock.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, buySellStock.maxProfit(new int[]{7,6,4,3,1}));
    }

    @After
    public void after() {

    }

}