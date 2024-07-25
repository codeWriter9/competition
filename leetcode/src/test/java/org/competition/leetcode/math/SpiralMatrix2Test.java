package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class SpiralMatrix2Test {

    private SpiralMatrix2 spiralMatrix2;

    @Before
    public void setUp() {
        spiralMatrix2 = new SpiralMatrix2();
    }

    @Test
    public void test() {
        assertNotNull(spiralMatrix2);
        int[][] matrix = spiralMatrix2.generateMatrix(3);
        assertArrayEquals(matrix, new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}});
        matrix = spiralMatrix2.generateMatrix(1);
        assertArrayEquals(matrix, new int[][]{{1}});
    }

    @After
    public void tearDown() {
        spiralMatrix2 = null;
    }
}
