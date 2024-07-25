package org.competition.leetcode.dp;

public class UniquePathWithObstacles {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) return 0;// if we can't reach first cell no way
        obstacleGrid[0][0] = 1;// only one way to reach first cell
        for (int index = 1; index < row; index++) { // for all rows in first column
            if (obstacleGrid[index][0] == 0 && obstacleGrid[index - 1][0] == 1) {
                obstacleGrid[index][0] = 1;// if we can reach previous cell and current cell is not obstacle
            }
            else obstacleGrid[index][0] = 0;// if we can't reach
        }
        for (int index = 1; index < column; index++) { // for all columns in first row
            if (obstacleGrid[0][index] == 0 && obstacleGrid[0][index - 1] == 1) {
                obstacleGrid[0][index] = 1;// if we can reach previous cell and current cell is not obstacle
            }
            else obstacleGrid[0][index] = 0;// if we can't reach
        }
        for (int rowIndex = 1; rowIndex < row; rowIndex++) { // now for every row
            for (int columnIndex = 1; columnIndex < column; columnIndex++) { // for every column
                if (obstacleGrid[rowIndex][columnIndex] == 0) // if there is no obstacle
                    obstacleGrid[rowIndex][columnIndex] = obstacleGrid[rowIndex - 1][columnIndex] + obstacleGrid[rowIndex][columnIndex - 1];
                else obstacleGrid[rowIndex][columnIndex] = 0;// if we can't reach
            }
        }
        return obstacleGrid[row - 1][column - 1];// return last cell
    }
}
