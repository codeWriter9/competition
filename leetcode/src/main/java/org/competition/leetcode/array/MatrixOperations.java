package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class MatrixOperations {

    public List<Integer> spiralOrder(int[][] matrix) {
        return spiralOrder(matrix, 0, 0);
    }

    public List<Integer> spiralOrder2(int[][] matrix) {
        return spiralOrder(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1, new ArrayList<>());
    }

    private List<Integer> spiralOrder(int[][] matrix, int up, int down, int left, int right, List<Integer> spirals) {
        for (int col = left; col <= right; col++) {
            spirals.add(matrix[up][col]);
        }
        for (int row = up + 1; row <= down; row++) {
            spirals.add(matrix[row][right]);
        }
        if (up != down) { // row boundaries did not collide
            for (int col = right - 1; col >= left; col--) {
                spirals.add(matrix[down][col]);
            }
        }
        if (left != right) { // column boundaries did not collide AND we did not visit the row earlier
            for (int row = down - 1; row > up; row--) {
                spirals.add(matrix[row][left]);
            }
        }
        if (spirals.size() < matrix[0].length * matrix.length) // check if all elements have been included
            return spiralOrder(matrix, up + 1, down - 1, left + 1, right - 1, spirals);
        else return spirals;
    }

    private List<Integer> spiralOrder(int[][] matrix, int row, int col) {
        List<Integer> res = new ArrayList<>();
        //left top -> right top
        for (int c = col; c < matrix[0].length - col; c++) {
            res.add(matrix[row][c]);
        }
        //right top -> right bottom
        for (int r = row + 1; r < matrix.length - row; r++) {
            res.add(matrix[r][matrix[0].length - col - 1]);
        }
        //right bottom -> left bottom
        if (row < matrix.length - row - 1) {
            for (int c = matrix[0].length - col - 2; c >= col; c--) {
                res.add(matrix[matrix.length - row - 1][c]);
            }
        }
        //left bottom -> left top
        if (col < matrix[0].length - col - 1) {
            for (int r = matrix.length - row - 2; r > row; r--) {
                res.add(matrix[r][col]);
            }
        }
        //sub problem
        if (row + 1 < matrix.length - row - 1 && col + 1 < matrix[0].length - col - 1) {
            res.addAll(spiralOrder(matrix, row + 1, col + 1));
        }

        return res;
    }
}