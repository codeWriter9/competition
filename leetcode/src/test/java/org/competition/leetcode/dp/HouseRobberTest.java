package org.competition.leetcode.dp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class HouseRobberTest extends TestCase {

    private HouseRobber houseRobber;

    public HouseRobberTest(String name) {
        super(name);
        houseRobber = new HouseRobber();
    }

    public static Test suite() {
        return new TestSuite(HouseRobberTest.class);
    }

    public void testHouseRobber() {
        Assert.assertNotNull(houseRobber);
        Assert.assertEquals(4, houseRobber.rob(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(12, houseRobber.rob(new int[]{2, 7, 9, 3, 1}));
        Assert.assertEquals(31, houseRobber.rob(new int[]{1, 1, 1, 1, 10, 1, 1, 19}));
        Assert.assertEquals(4, houseRobber.rob(new int[]{2, 1, 1, 2}));
    }
}
