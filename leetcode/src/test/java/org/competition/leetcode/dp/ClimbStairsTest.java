package org.competition.leetcode.dp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class ClimbStairsTest  extends TestCase {

    private ClimbStairs climbStairs;

    public ClimbStairsTest(String name) {
        super(name);
        climbStairs = new ClimbStairs();
    }

    public static Test suite() {
        return new TestSuite(ClimbStairsTest.class);
    }

    public void testClimbStairs() {
        Assert.assertNotNull(climbStairs);
        Assert.assertEquals(1, climbStairs.climbStairs(1));
        Assert.assertEquals(2, climbStairs.climbStairs(2));
        Assert.assertEquals(3, climbStairs.climbStairs(3));
        Assert.assertEquals(5, climbStairs.climbStairs(4));
    }
}
