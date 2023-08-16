package org.competition.leetcode.array;

public class IslandPerimeter {

    private int VISITED = -1;
    private int WATER = 0;
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int row=0;row<grid.length;row++) {
            for(int col=0;col<grid[row].length;col++) {
                if(grid[row][col] == 1) {
                    return getPerimeter(grid, row, col);
                }
            }
        }
        return perimeter;
    }

    private int getPerimeter(int[][] grid, int row, int col) {
        if(row < 0 || row >= grid.length
                || col < 0 || col >= grid[row].length || grid[row][col] == 0
                ||  grid[row][col] == WATER) return 1;
        if(grid[row][col] == VISITED) return 0;
        grid[row][col] = VISITED;
        int perimeter = 0;
        perimeter += getPerimeter(grid, row - 1, col);
        perimeter += getPerimeter(grid, row + 1, col);
        perimeter += getPerimeter(grid, row, col - 1);
        perimeter += getPerimeter(grid, row, col + 1);
        return perimeter;
    }
}
