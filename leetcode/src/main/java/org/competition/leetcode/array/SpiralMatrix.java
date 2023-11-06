package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {

    enum DIRECTION {
        RIGHT, DOWN, LEFT, UP
    }

    class Position {

        int row;
        int col;
        DIRECTION direction;

        public Position(int row, int col, DIRECTION direction) {
            this.row = row;
            this.col = col;
            this.direction = direction;
        }

        @Override
        public String toString() {
            return "Position{" +
                    "row=" + row +
                    ", col=" + col +
                    ", direction=" + direction +
                    '}';
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> collection = new LinkedList<>();
        int row = 0;
        int col = 0;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        //System.out.println(" rowLength = " + rowLength + " colLength = " + colLength);
        int rowStart = 0;
        int colStart = 0;
        int total = rowLength * colLength;
        int current = 0;
        Position position = new Position(0, 0, DIRECTION.RIGHT);
        //System.out.println("[  0] position = " + position + " collection = " + collection);
        while(current < colLength + rowLength + colLength + rowLength) {
            if(position.direction == DIRECTION.RIGHT && position.col < colLength) {
                collection.add(matrix[position.row][position.col]);
                position.col = position.col + 1;
                //System.out.println("[  1] position = " + position + " collection = " + collection);
            }
            else if(position.direction == DIRECTION.RIGHT && position.col == colLength) {
                position.direction = DIRECTION.DOWN;
                position.col = colLength - 1;
                position.row = position.row + 1;
                //System.out.println("[  2] position = " + position + " collection = " + collection);
            }
            else if(position.direction == DIRECTION.DOWN && position.row < rowLength) {
                collection.add(matrix[position.row][position.col]);
                position.row = position.row + 1;
                //System.out.println("[  3] position = " + position + " collection = " + collection);
            }
            else if(position.direction == DIRECTION.DOWN && position.row == rowLength) {
                position.direction = DIRECTION.LEFT;
                position.col = position.col - 1;
                position.row = rowLength - 1;
                //System.out.println("[  4] position = " + position + " collection = " + collection);
            }
            else if(position.direction == DIRECTION.LEFT && position.col > -1) {
                collection.add(matrix[position.row][position.col]);
                position.col = position.col - 1;
                //System.out.println("[  5] position = " + position + " collection = " + collection);
            }
            else if(position.direction == DIRECTION.LEFT && position.col < 0) {
                position.direction = DIRECTION.UP;
                position.col = 0;
                position.row = rowLength - 1;
                //System.out.println("[  6] position = " + position + " collection = " + collection);
            }
            else if(position.direction == DIRECTION.UP && position.row > -1) {
                position.row = position.row - 1;
                collection.add(matrix[position.row][position.col]);
                //System.out.println("[  7] position = " + position + " collection = " + collection);
            }

            else {
                //System.out.println("[ 50] position = " + position + " collection = " + collection);
            }

            current++;
        }
        //System.out.println("[ 99] current = " + current);
        //System.out.println("[100] collection = " + collection);
        return collection;
    }

    private int row(int row, int col, int rowLength, int colLength, int rowStart, int colStart) {
        if(row < rowLength - 1 && col == colLength - 1) {
            return row++;
        }
        else if(row >= rowStart && col == colStart) {
            return row--;
        }
        else {
            return row;
        }
    }

    private int col(int row, int col, int rowLength, int colLength, int rowStart, int colStart) {
        if(col < colLength && row == rowStart) {
            return col++;
        }
        else if(col >= colStart && row == rowLength - 1) {
            return col--;
        }
        else {
            return col;
        }
    }

    public List<Integer> spiralOrderLeetCode(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = columns - 1;
        int down = rows - 1;

        while (result.size() < rows * columns) {
            // Traverse from left to right.
            for (int col = left; col <= right; col++) {
                result.add(matrix[up][col]);
                //System.out.println("[  0] matrix[" + up + "][" + col + "] = " + matrix[up][col]);
                //System.out.println("[  1] collection = " + result);
            }
            // Traverse downwards.
            for (int row = up + 1; row <= down; row++) {
                result.add(matrix[row][right]);
                //System.out.println("[  0] matrix[" + up + "][" + row + "] = " + matrix[up][row]);
                //System.out.println("[  2] collection = " + result);
            }
            // Make sure we are now on a different row.
            if (up != down) {
                // Traverse from right to left.
                for (int col = right - 1; col >= left; col--) {
                    result.add(matrix[down][col]);
                    //System.out.println("[  3] matrix[" + down + "][" + col + "] = " + matrix[down][col]);
                    //System.out.println("[  4] collection = " + result);
                }
            }
            // Make sure we are now on a different column.
            if (left != right) {
                // Traverse upwards.
                for (int row = down - 1; row > up; row--) {
                    result.add(matrix[row][left]);
                    //System.out.println("[  5] matrix[" + row + "][" + left + "] = " + matrix[row][left]);
                    //System.out.println("[  6] collection = " + result);
                }
            }
            left++;
            right--;
            up++;
            down--;
            //System.out.println("[  7] left = " + left + " right = " + right + " up = " + up + " down = " + down);
        }

        return result;
    }
}
