package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class ReshapeMatrixTest {

    private ReshapeMatrix reshapeMatrix;

    @Before
    public void before() {
        reshapeMatrix = new ReshapeMatrix();
    }

    @Test
    public void test() {
        assertNotNull(reshapeMatrix);
        assertArrayEquals(new int[][]{{1, 2, 3, 4}}, reshapeMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4));
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, reshapeMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4));
    }

    @After
    public void after() {
        reshapeMatrix = null;
    }
}