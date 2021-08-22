package org.competition.leetcode.dp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class StockBuySellTest extends TestCase {

    private StockBuySell stockBuySell;

    public StockBuySellTest(String name) {
        super(name);
        stockBuySell = new StockBuySell();
    }

    public static Test suite() {
        return new TestSuite(StockBuySellTest.class);
    }

    public void testClimbStairs() {
        Assert.assertNotNull(stockBuySell);
        Assert.assertEquals(5, stockBuySell.stockBuySell(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0, stockBuySell.stockBuySell(new int[]{7,6,4,3,1}));
    }

}
