package org.competition.leetcode.strings;

public class LongestCommonSubsequence {

    private int [][] cache;

    private void initialize(int x, int y) {
        cache = new int[x][y];
        for(int row=0;row<x;row++) {
            for(int col=0;col<y;col++) {
                cache[row][col] = -1;
            }
        }
    }

    public int lcs(String text1, String text2) {
        initialize(text1.length() + 1, text2.length() + 1);
        return lcs(text1.toCharArray(), text1.length(), text2.toCharArray(), text2.length());
    }

    private int lcs(char [] text1, int pointer1, char [] text2, int pointer2) {
        if(pointer1 == 0 || pointer2 == 0) return 0;
        if(cache[pointer1 - 1][pointer2 - 1] != -1) return cache[pointer1 - 1][pointer2 - 1];
        if(text1[pointer1 - 1] == text2[pointer2 - 1]) {
            cache[pointer1 - 1][pointer2 - 1] = 1 + lcs(text1, pointer1 - 1, text2, pointer2 -1);
        } else {
            cache[pointer1 - 1][pointer2 - 1] = Math.max(lcs(text1, pointer1 - 1, text2, pointer2), lcs(text1, pointer1 , text2, pointer2 -1));
        }
        return cache[pointer1 - 1][pointer2 - 1];
    }

    /**
     *     a   c   e
     * a   1   0   0
     * b   0   0   0
     * c   0   2   0
     * d   0   0   0
     * e   0   0   3
     * f
     */

    /**
     *    B P G T R
     * R  0 0 0 0 1
     * T  0 0 0 1 0
     * P  0 1 0 0 0
     * C  0 0 0 0 0
     * R  0 0 0 0 2
     */

}