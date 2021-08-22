package org.competition.leetcode.dp;


/**
 * Climb a Staircase - n steps to top
 * Each time you can take 1 or 2 step
 */
public class ClimbStairs {


    /**
     * stairs = 1 => 1 way  => take 1 step
     * stairs = 2 => 2 ways => take 1 step + 1 step
     * => take 2 step
     * stairs = 3 => 3 ways => take 1 step + 1 step + 1 step
     * => take 2 step + 1 step
     * => take 1 step + 2 step
     * stairs = 4 => 5 ways => take 1 step + 1 step + 1 step + 1 step
     * => take 2 step + 2 step
     * => take 2 step + 1 step + 1 step
     * => take 1 step + 1 step + 2 step
     * => take 1 step + 2 step + 1 step
     * stairs = 5 => 8 ways => take 1 step + 1 step + 1 step + 1 step + 1 step
     * => take 2 step + 1 step + 1 step + 1 step
     * => take 1 step + 2 step + 1 step + 1 step
     * => take 1 step + 1 step + 2 step + 1 step
     * => take 1 step + 1 step + 1 step + 2 step
     * => take 2 step + 2 step + 1 step
     * => take 1 step + 2 step + 2 step
     * => take 2 step + 1 step + 2 step
     *
     * @param stairs
     * @return
     */
    public int climbStairs(int stairs) {
        if (stairs <= 1) return 1;
        int[] memo = new int[stairs + 1];
        memo[0] = 1;
        memo[1] = 1;
        for (int loop = 2; loop < memo.length; loop++) memo[loop] = 0;
        return climbStairs(stairs, memo);
    }

    private int climbStairs(int stairs, int[] memo) {
        if (memo[stairs] != 0) return memo[stairs];
        memo[stairs] = climbStairs(stairs - 1, memo) + climbStairs(stairs - 2, memo);
        return memo[stairs];
    }
}
