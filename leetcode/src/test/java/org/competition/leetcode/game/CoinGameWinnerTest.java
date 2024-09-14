package org.competition.leetcode.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinGameWinnerTest {

    private CoinGameWinner coinGameWinner;

    @Before
    public void setUp() {
        coinGameWinner = new CoinGameWinner();
    }

    @Test
    public void test() {
        assertEquals("Alice", coinGameWinner.losingPlayer(2, 7));   // test code here
        assertEquals("Bob", coinGameWinner.losingPlayer(4, 11));     // test code here
    }

    @After
    public void tearDown() {
        coinGameWinner = null;
    }
}
