package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IslandPerimeterTest {

    private IslandPerimeter islandPerimeter;

    @Before
    public void setUp() throws Exception {
        islandPerimeter = new IslandPerimeter();
    }

    @Test
    public void testIslandPerimeter() {
        assertNotNull(islandPerimeter);
        assertEquals(16, islandPerimeter.islandPerimeter(new int [][] {{0,1,0,0},
                                                                        {1,1,1,0},
                                                                        {0,1,0,0},
                                                                        {1,1,0,0}}));
        assertEquals(4, islandPerimeter.islandPerimeter(new int [][] {{1}}));
        assertEquals(4, islandPerimeter.islandPerimeter(new int [][] {{1,0}}));
    }

    @After
    public void tearDown() throws Exception {
        islandPerimeter = null;
    }
}
