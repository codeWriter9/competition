package org.competition.leetcode.dp;

public class Tribonacci {

    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n <= 2) return 1;
        int [] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        for(int index=3;index<n+1;index++) memo[index] = -1;
        return tribonacci(n, memo);
    }

    private int tribonacci(int n, int [] memo) {
        if(memo[n] != -1) return memo[n];
        else {
            memo[n] = tribonacci(n - 1, memo) + tribonacci(n - 2, memo) + tribonacci(n - 3, memo);
            return memo[n];
        }
    }
}
