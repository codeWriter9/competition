package org.competition.leetcode.dp;

import java.util.Arrays;

public class MinimumPathSum {

    int dp[][];

    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        for(int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return calculate(grid, 0, 0);
    }

    private int calculate(int[][] grid, int row, int col) {
        if(row == grid.length || col == grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (row == grid.length - 1 && col == grid[0].length - 1) return grid[row][col];
        if(dp[row][col] != -1) return dp[row][col];
        dp[row][col] = grid[row][col] +
                Math.min(calculate(grid, row + 1, col), calculate(grid, row, col + 1));
        return dp[row][col];
    }
}
