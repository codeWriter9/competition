package org.competition.leetcode.game;

public class NumberOfWinningPlayers {

    int [][] counts;

    {
        counts = new int[11][11];
    }

    public void reset() {
        counts = new int[11][11];
    }

    public int winningPlayerCount(int n, int[][] pick) {
        for(int [] p : pick) {
            counts[p[0]][p[1]]++;
        }
        int result=0;
        for(int player=0;player<counts.length;player++) {
            for(int balls=0;balls<counts[player].length;balls++) {
                if(counts[player][balls] > player) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
