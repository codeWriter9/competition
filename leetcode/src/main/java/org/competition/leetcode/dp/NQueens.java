package org.competition.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import static java.util.Arrays.asList;

public class NQueens {

    static int SOLUTION = 0;

    public static void main(String[] args) {
        String[][] board = new String[8][8];
        fill(board);
        printBoard(board);
        System.out.println();
        canPlace(board, new ArrayList<>(), 0);

    }

    private static boolean canPlace(String[][] board, List<List<Integer>> positions, int row) {
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


    private static void printBoard(final String[][] board) {
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static void fill(final String[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ".";
            }
        }
    }


    private static boolean isQueenAttack(List<List<Integer>> queens, int row2, int col2) {
        for (int outer = 0; outer < queens.size(); outer++) {
            if (isQueenAttack(queens.get(outer).get(0), queens.get(outer).get(1), row2, col2)) return true;
        }
        return false;
    }

    private static boolean isQueenAttack(int row1, int col1, int row2, int col2) {
        return isRookAttack(row1, col1, row2, col2) || isBishopAttack(row1, col1, row2, col2);
    }

    private static boolean isRookAttack(int row1, int col1, int row2, int col2) {
        if ((row1 == row2) || (col1 == col2)) return true;
        else return false;
    }

    private static boolean isBishopAttack(int row1, int col1, int row2, int col2) {
        if (abs(row1 - row2) == abs(col1 - col2)) return true;
        return false;
    }
}