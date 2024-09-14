package org.competition.leetcode.recursive;

import static java.util.Arrays.fill;

public class DecodeWays {

    char[] array;
    int[] dp;

    public int numDecodings(String s) {
        array = s.toCharArray();
        dp = new int[array.length];
        fill(dp, -1);
        return numDecodings(0);
    }

    private int numDecodings(int start) {
        if (start == array.length) {
            return 1;
        }
        if (array[start] == '0') {
            return 0;
        }
        if (dp[start] != -1) return dp[start];
        int result = numDecodings(start + 1);
        if (start + 1 < array.length && (array[start] == '1' || (array[start] == '2' && array[start + 1] < '7'))) {
            result += numDecodings(start + 2);
        }
        return dp[start] = result;
    }
}
