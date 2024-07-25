package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathWithObstaclesTest {

    private UniquePathWithObstacles uniquePathWithObstacles;

    @Before
    public void setUp() throws Exception {
        uniquePathWithObstacles = new UniquePathWithObstacles();
    }

    @Test
    public void testUniquePathWithObstacles() {
        assertEquals(2, uniquePathWithObstacles.uniquePathsWithObstacles(
                new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        assertEquals(1, uniquePathWithObstacles.uniquePathsWithObstacles(
                new int[][]{{0, 1}, {0, 0}}));
        assertEquals(0, uniquePathWithObstacles.uniquePathsWithObstacles(
                new int[][]{{0, 0}, {1, 1}, {0, 0}}));
    }

    @After
    public void tearDown() throws Exception {
        uniquePathWithObstacles = null;
    }
}
