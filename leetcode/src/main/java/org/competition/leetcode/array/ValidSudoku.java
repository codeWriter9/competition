package org.competition.leetcode.array;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] != '.') {
                    if (!isSafeAndValid(board, row, col)) return false;
                }
            }
        }
        return true;
    }

    private boolean isSafeAndValid(char[][] board, int row, int col) {
        // Check if row conflict
        for (int r = 0; r < board.length; r++) {
            if (r != row && board[r][col] == board[row][col]) return false;
        }

        // Check if column conflict
        for (int c = 0; c < board.length; c++) {
            if (c != col && board[row][c] == board[row][col]) return false;
        }


        // Check 3*3 block
        for (int index = 0; index < board.length; index++) {
            int x = 3 * (row / 3) + index / 3;
            int y = 3 * (col / 3) + index % 3;
            if (x != row && y != col && board[x][y] == board[row][col])
                return false;
        }

        return true;
    }
}