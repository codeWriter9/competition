package org.competition.leetcode.math;

public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int [][] result = new int[row][col];
        for(int rowIndex=0;rowIndex<row;rowIndex++) {
            for(int colIndex=0;colIndex<col;colIndex++) {
                result[rowIndex][colIndex] = image[rowIndex][col - colIndex - 1] == 0 ? 1 : 0;
            }
        }
        return result;
    }
}
