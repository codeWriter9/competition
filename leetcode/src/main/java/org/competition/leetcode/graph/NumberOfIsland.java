package org.competition.leetcode.graph;

public class NumberOfIsland {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int numberOfIslands = 0;
        for(int row=0;row<grid.length;row++) {
            for(int col=0;col<grid[row].length;col++) {
                if(grid[row][col] == '1') {
                    ++numberOfIslands;
                    dfs(grid, row, col);
                }
            }
        }
        return numberOfIslands;
    }

    private void dfs(char[][] grid, int row, int col) {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] == '0')
            return;
        grid[row][col] = '0';// Mark as Water
        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}