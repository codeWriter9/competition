package org.competition.leetcode.array;

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for(int row=0;row< board.length;row++) {
            for(int col=0;col<board[row].length;col++) {
                if(backTrack(board, row, col, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backTrack(char [][] board, int row, int col, int wordIndex, String word) {
        if(wordIndex >= word.length()) {
            return true;// all characters exhausted
        }
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || word.charAt(wordIndex) != board[row][col]) {
            return false;// either array out of bounds or character not matching
        }

        boolean result = false;
        board[row][col] = '#';
        int [] rowOffSet = {0, 1, 0, -1};
        int [] colOffSet = {1, 0, -1, 0};
        for(int direction =0;direction<4;direction++) {
            int newRow = row + rowOffSet[direction];
            int newCol = col + colOffSet[direction];
            result = backTrack(board, newRow, newCol, wordIndex + 1, word);// check for next character
            if(result) {
                System.out.println("newRow: " + newRow + " newCol: " + newCol
                        + " word[c] = " + word.charAt(wordIndex)
                        + " board[r][c] = " + board[newRow][newCol]);
                break;
            }
        }
        board[row][col] = word.charAt(wordIndex);
        return result;
    }
}
