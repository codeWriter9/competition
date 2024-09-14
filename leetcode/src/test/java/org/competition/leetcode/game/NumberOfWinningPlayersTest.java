package org.competition.leetcode.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfWinningPlayersTest {

        private NumberOfWinningPlayers numberOfWinningPlayers;

        @Before
        public void setUp() {
            numberOfWinningPlayers = new NumberOfWinningPlayers();
        }

        @Test
        public void test() {
            assertEquals(2, numberOfWinningPlayers.winningPlayerCount(4, new int[][]{{0, 0}, {1, 0}, {1, 0}, {2, 1}, {2, 1}, {2, 0}}));   // test code here
            numberOfWinningPlayers.reset();
            assertEquals(0, numberOfWinningPlayers.winningPlayerCount(5, new int[][]{{1, 1}, {1, 2}, {1, 3}, {1, 4}}));     // test code here
            numberOfWinningPlayers.reset();
            assertEquals(1, numberOfWinningPlayers.winningPlayerCount(5, new int[][]{{1, 1}, {2, 4}, {2, 4}, {2, 4}}));     // test code here
        }

        @After
        public void tearDown() {
            numberOfWinningPlayers = null;
        }
}
