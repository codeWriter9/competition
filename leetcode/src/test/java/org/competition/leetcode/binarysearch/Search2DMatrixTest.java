package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Search2DMatrixTest {

    private Search2DMatrix search2DMatrix;

    @Before
    public void setUp() {
        search2DMatrix = new Search2DMatrix();
    }

    @Test
    public void test() {
        assertTrue(search2DMatrix
                .searchMatrix(
                        new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 3)
        );
        assertFalse(search2DMatrix
                .searchMatrix(
                        new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } }, 13)
        );
        assertFalse(search2DMatrix
                .searchMatrix(
                        new int[][] { { 1 } }, 2)
        );
        assertTrue(search2DMatrix
                .searchMatrix(
                        new int[][] { { 1 } }, 1)
        );
    }

    @After
    public void tearDown() {
        search2DMatrix = null;
    }
}
