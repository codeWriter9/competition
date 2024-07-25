package org.competition.leetcode.strings;

import java.util.Arrays;

public class LevenshteinDistance {

    public int minDistance(String word1, String word2) {
        int [][] memo = new int[word1.length() + 1][word2.length() + 1];
        for(int [] row : memo) {
            Arrays.fill(row, 0);
        }
        return minDistance(word1, word2, word1.length(), word2.length(), memo);
    }

    private int minDistance(String word1, String word2, int i1, int i2, int [][] memo) {
        int min = 0;
        if(word1.length() == 0 && word2.length() == 0) {
            return 0;
        }
        else if(i1 == 0) {
            return i2;
        }
        else if(i2 == 0) {
            return i1;
        }
        else if(memo[i1][i2] != 0) return memo[i1][i2];
        else if(word1.charAt(i1 - 1) == word2.charAt(i2 - 1)) {
            min = minDistance(word1, word2, i1 - 1, i2 - 1, memo);
        }
        else {
            int insert = minDistance(word1, word2, i1, i2 - 1, memo);
            int delete = minDistance(word1, word2, i1 -1, i2, memo);
            int replace = minDistance(word1, word2, i1 - 1, i2 - 1, memo);
            min = 1 + Math.min(insert, Math.min(delete, replace));
        }
        memo[i1][i2] = min;
        return min;
    }
}
