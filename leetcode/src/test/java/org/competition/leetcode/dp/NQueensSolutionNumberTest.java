package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NQueensSolutionNumberTest {

    private NQueensSolutionNumber nQueensSolutionNumber;

    @Before
    public void before() {
        nQueensSolutionNumber = new NQueensSolutionNumber();
    }

    @Test
    public void testNQueens() {
        assertNotNull(nQueensSolutionNumber);
        assertEquals(92, nQueensSolutionNumber.totalNQueens(8));
    }

    @After
    public void after() {

    }

}