package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class SetMatrixZeroTest {

    private SetMatrixZero setMatrixZero;

    @Before
    public void setUp() throws Exception {
        setMatrixZero = new SetMatrixZero();
    }

    @Test
    public void test() {
        assertNotNull(setMatrixZero);
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrixZero.setZeroes(matrix);
        assertArrayEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, matrix);
        matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setMatrixZero.setZeroes(matrix);
        assertArrayEquals(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}, matrix);
    }

    @After
    public void tearDown() throws Exception {
        setMatrixZero = null;
    }
}
