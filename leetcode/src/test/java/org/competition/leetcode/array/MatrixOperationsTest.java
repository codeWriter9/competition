package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MatrixOperationsTest {

    private MatrixOperations matrixOperations;

    @Before
    public void before() {
        matrixOperations = new MatrixOperations();
    }

    @Test
    public void testMatrixOperationsNotNull() {
        assertNotNull(matrixOperations);
    }

    @Test
    public void testMatrixOperations() {
        assertEquals(asList(1, 2, 3, 6, 9, 8, 7, 4, 5),
                matrixOperations.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    public void testMatrixOperations2() {
        assertEquals(asList(1, 2, 3, 6, 9, 8, 7, 4, 5),
                matrixOperations.spiralOrder2(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @After
    public void after() {
        matrixOperations = null;
    }
}