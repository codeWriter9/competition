package org.competition.leetcode.array;


public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        else return factor(flatten(nums), r, c);
    }

    private int[] flatten(int[][] mat) {
        int[] flatArray = new int[mat.length * mat[0].length];
        int index = 0;
        for (int [] row : mat) {
            for (int cell : row) {
                flatArray[index++] = cell;
            }
        }
        return flatArray;
    }

    private int[][] factor(int[] flatArray, int r, int c) {
        int[][] resultArray = new int[r][c];
        int index = 0;
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                resultArray[row][col] = flatArray[index];
                index++;
            }
        }
        return resultArray;
    }
}
