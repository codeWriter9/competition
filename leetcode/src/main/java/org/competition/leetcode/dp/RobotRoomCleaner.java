package org.competition.leetcode.dp;

public class RobotRoomCleaner {

    public void check(int [][] grid) {
        int [] rowOffSet = {0, 1, 0, -1};
        int [] colOffSet = {1, 0, -1, 0};
        for(int row=0;row< grid.length;row++) {
            for(int col=0;col<grid[row].length;col++) {
                for(int direction =0;direction<4;direction++) {
                    int newRow = row + rowOffSet[direction];
                    int newCol = col + colOffSet[direction];
                    if(newRow < 0 || newRow >= grid.length || newCol < 0 || newCol >= grid[0].length) {
                        continue;
                    }
                    System.out.println("newRow: " + newRow + " newCol: " + newCol + " array = " + grid[newRow][newCol]);
                }
            }
        }
    }

}
