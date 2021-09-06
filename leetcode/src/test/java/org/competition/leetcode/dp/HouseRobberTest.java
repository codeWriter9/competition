package org.competition.leetcode.dp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


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
        assertNotNull(houseRobber);
        assertEquals(4, houseRobber.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, houseRobber.rob(new int[]{2, 7, 9, 3, 1}));
        assertEquals(31, houseRobber.rob(new int[]{1, 1, 1, 1, 10, 1, 1, 19}));
        assertEquals(4, houseRobber.rob(new int[]{2, 1, 1, 2}));
    }

    public void testHouseRobberCircle() {
        assertNotNull(houseRobber);
//        assertEquals(3, houseRobber.robCircle(new int[]{2, 3, 2}));
//        assertEquals(4, houseRobber.robCircle(new int[]{1, 2, 3, 1}));
//        assertEquals(3, houseRobber.robCircle(new int[]{1, 2, 3}));
    }
}