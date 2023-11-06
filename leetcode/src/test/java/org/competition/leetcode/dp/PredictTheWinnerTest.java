package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PredictTheWinnerTest {

    private PredictTheWinner predictTheWinner;

    @Before
    public void setUp()  {
        predictTheWinner = new PredictTheWinner();
    }

    @Test
    public void test() {
        assertNotNull(predictTheWinner);
        assertFalse(predictTheWinner.predictTheWinner(new int[]{1, 5, 2}));
            assertTrue(predictTheWinner.predictTheWinner(new int[]{1, 5, 233, 7}));

        assertFalse(predictTheWinner.predictTheWinner2DArray(new int[]{1, 5, 2}));
        assertTrue(predictTheWinner.predictTheWinner2DArray(new int[]{1, 5, 233, 7}));

        assertFalse(predictTheWinner.predictTheWinnerRecursive(new int[]{1, 5, 2}));
        assertTrue(predictTheWinner.predictTheWinnerRecursive(new int[]{1, 5, 233, 7}));
    }

    @After
    public void tearDown() {
        predictTheWinner = null;
    }
}
