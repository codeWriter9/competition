package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class SpiralMatrixTest {

    private SpiralMatrix spiralMatrix;

    @Before
    public void setUp() throws Exception {
        spiralMatrix = new SpiralMatrix();
    }

    @Test
    public void testMatrix() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4,},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        assertEquals(asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
                spiralMatrix.spiralOrderLeetCode(matrix));
        matrix = new int[][]{
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9,}
        };
        assertEquals(asList(1,2,3,6,9,8,7,4,5),
                spiralMatrix.spiralOrderLeetCode(matrix));

    }

    @After
    public void destroy() throws Exception {
        spiralMatrix = null;
    }
}
