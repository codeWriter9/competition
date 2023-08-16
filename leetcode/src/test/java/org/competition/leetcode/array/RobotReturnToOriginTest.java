package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotReturnToOriginTest {

    private RobotReturnToOrigin robotReturnToOrigin;

    @Before
    public void before() {
        robotReturnToOrigin = new RobotReturnToOrigin();
    }

    @Test
    public void testRobotReturnToOrigin() {
        assertNotNull(robotReturnToOrigin);
        assertTrue(robotReturnToOrigin.judgeCircle("UD"));
        assertFalse(robotReturnToOrigin.judgeCircle("LL"));
    }

    @After
    public void after() {
        robotReturnToOrigin = null;
    }
}
