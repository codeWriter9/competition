package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToeplitzMatrixTest {

    private ToeplitzMatrix toeplitzMatrix;

    @Before
    public void before() {
        toeplitzMatrix = new ToeplitzMatrix();
    }

    @Test
    public void testToeplitzMatrixNotNull() {
        assertNotNull(toeplitzMatrix);
    }

    @Test
    public void testToeplitzMatrix() {
        assertTrue(toeplitzMatrix.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
    }

    @Test
    public void testToeplitzMatrix2() {
        assertFalse(toeplitzMatrix.isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}}));
    }

    @After
    public void after() {
        toeplitzMatrix = null;
    }

}