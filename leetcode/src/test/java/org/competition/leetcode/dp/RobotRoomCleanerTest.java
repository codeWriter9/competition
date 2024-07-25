package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RobotRoomCleanerTest {

    private RobotRoomCleaner robotRoomCleaner;

    @Before
    public void before() {
        robotRoomCleaner = new RobotRoomCleaner();
    }

    @Test
    public void testRobotRoomCleaner() {
        assertNotNull(robotRoomCleaner);
        robotRoomCleaner.check(new int[][]{{4, 5},
                {6, 7}});
    }

    @After
    public void after() {
        robotRoomCleaner = null;
    }

}