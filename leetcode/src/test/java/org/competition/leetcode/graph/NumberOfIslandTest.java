package org.competition.leetcode.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NumberOfIslandTest {

    private NumberOfIsland numberOfIsland;

    @Before
    public void before() {
        numberOfIsland = new NumberOfIsland();
    }

    @Test
    public void testNumberOfIslandNotNull() {
        assertNotNull(numberOfIsland);
    }

    @Test
    public void testNumberOfIslandNull() {
        assertEquals(0, numberOfIsland.numIslands(null));
    }

    @Test
    public void testNumberOfIsland0() {
        assertEquals(0, numberOfIsland.numIslands(new char[0][0]));
    }

    @Test
    public void testNumberOfIsland1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, numberOfIsland.numIslands(grid));
    }

    @Test
    public void testNumberOfIsland2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, numberOfIsland.numIslands(grid));
    }

    @Test
    public void testNumberOfIsland3() {
        char[][] grid = {
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'}
        };
        assertEquals(1, numberOfIsland.numIslands(grid));
    }

    @After
    public void after() {
        numberOfIsland = null;
    }
}