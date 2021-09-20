package org.competition.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import static java.util.Arrays.asList;

public class NQueensSolutionNumber {

    int SOLUTION = 0;

    public int totalNQueens(int n) {
        String[][] board = new String[n][n];
        SOLUTION = 0;
        fill(board);
        printBoard(board);
        System.out.println();
        canPlace(board, new ArrayList<>(), 0);
        return SOLUTION;
    }

    private boolean canPlace(String[][] board, List<List<Integer>> positions, int row) {
        if (row >= board.length) {
            SOLUTION++;
            System.out.println("Solution:" + SOLUTION);
            printBoard(board);// print board
            System.out.println();
            return true;// Placed all
        }

        for (int col = 0; col < board.length; col++) {
            if (isQueenAttack(positions, row, col)) continue;// if current position is under attack check next position
            board[row][col] = "Q";// Place Queen
            positions.add(asList(row, col));// save current position
            canPlace(board, positions, row + 1);// check for next row
            positions.remove(asList(row, col));// Current position did not work so remove
            board[row][col] = ".";// replace Queen
        }
        return false;
    }

    private void printBoard(final String[][] board) {
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private void fill(final String[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ".";
            }
        }
    }

    private boolean isQueenAttack(List<List<Integer>> queens, int row2, int col2) {
        for (List<Integer> row : queens) {
            if (isQueenAttack(row.get(0), row.get(1), row2, col2)) return true;
        }
        return false;
    }

    private boolean isQueenAttack(int row1, int col1, int row2, int col2) {
        return isRookAttack(row1, col1, row2, col2) || isBishopAttack(row1, col1, row2, col2);
    }

    private boolean isRookAttack(int row1, int col1, int row2, int col2) {
        return (row1 == row2) || (col1 == col2);
    }

    private boolean isBishopAttack(int row1, int col1, int row2, int col2) {
        return abs(row1 - row2) == abs(col1 - col2);
    }
}
