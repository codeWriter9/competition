package org.competition.leetcode.dp;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int [] memo = new int[cost.length + 1];
        memo[cost.length] = 0;// we have already reached the top
        memo[cost.length - 1] =  cost[cost.length - 1];// we pay cost.length - 1
        for(int i = cost.length-2 ; i >= 0 ; i-- ) { // walk back bottom up
            memo[i] = cost[i] + Math.min(memo[i + 1], memo[i + 2]);// save cost of min of 1 or 2 step with cost of 1
        }
        return Math.min(memo[0], memo[1]);// First step you take must be the minimum of first 2
    }
}
