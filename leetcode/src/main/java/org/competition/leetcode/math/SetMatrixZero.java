package org.competition.leetcode.math;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {

    public void setZeroes(int[][] matrix) {
        Set<Pair> pairs = new HashSet<>();
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                if(matrix[row][col] == 0) {
                    pairs.add(new Pair(row, col));
                }
            }
        }
        // we have where the zeroes are located
        for(Pair pair : pairs) {
            int row = pair.row;
            int col = pair.col;
            for(int i=0;i<matrix[row].length;i++) {
                matrix[row][i] = 0;
            }
            for(int i=0;i<matrix.length;i++) {
                matrix[i][col] = 0;
            }
        }
    }

    class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public int hashCode() {
            return row * col;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null) {
                return false;
            }
            if(!(obj instanceof Pair)) {
                return false;
            }
            Pair pair = (Pair) obj;
            return pair.row == this.row && pair.col == this.col;
        }
    }
}
