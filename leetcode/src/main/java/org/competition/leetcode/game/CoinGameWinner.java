package org.competition.leetcode.game;

public class CoinGameWinner {

    public String losingPlayer(int x, int y) {
        String alice = "Alice";
        String bob = "Bob";
        int turn = 1;
        while (x > 0 && y / 4 > 0) {
            x -= 1;
            y -= 4;
            turn++;
        }
        return turn % 2 == 0 ? alice : bob;
    }
}
