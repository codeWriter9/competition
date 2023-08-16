package org.competition.leetcode.array;

public class ColoringABorder {

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        if(grid[row][col] == color) return grid;
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        dfs(grid, row, col, grid[row][col], visited, color);
        return grid;
    }

    public void dfs(int [][] grid, int row, int col, int old, boolean [][] visited, int color){
        if(row < 0 || row >= grid.length
                || col < 0 || col >= grid[0].length
                || visited[row][col] || grid[row][col] != old)
            return;
        boolean border = false;
        visited[row][col] = true;
        if(row == 0 || row == grid.length - 1 || col == 0 || col == grid[0].length - 1
        || grid[row - 1][col] != old || grid[row + 1][col] != old
        || grid[row][col -1 ] != old || grid[row][col + 1] != old)
            border = true;
        dfs(grid, row - 1, col, old, visited, color);
        dfs(grid, row + 1, col, old, visited, color);
        dfs(grid, row, col - 1, old, visited, color);
        dfs(grid, row, col + 1, old, visited, color);
        if(border) grid[row][col] = color;
    }
}
