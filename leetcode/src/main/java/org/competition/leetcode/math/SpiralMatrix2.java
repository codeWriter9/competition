package org.competition.leetcode.math;

public class SpiralMatrix2 {

    public int[][] generateMatrix(int n) {
        int upper = n * n;
        int [][] matrix = new int[n][n];
        int count = 1;
        int row = 0;
        int col = 0;
        while(count <= upper) {
            matrix[row][col] = count;
            count++;
            if(col + 1 < n && matrix[row][col + 1] == 0 && (row == 0 || matrix[row - 1][col] != 0)) {
                col++;
            } else if(row + 1 < n && matrix[row + 1][col] == 0) {
                row++;
            } else if(col - 1 >= 0 && matrix[row][col - 1] == 0) {
                col--;
            } else if(row - 1 >= 0 && matrix[row - 1][col] == 0) {
                row--;
            }
        }
        return matrix;
    }
}
