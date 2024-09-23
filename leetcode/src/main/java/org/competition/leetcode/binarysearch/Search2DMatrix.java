package org.competition.leetcode.binarysearch;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;// if 2 D Matrix is N x M then starting index is 0
        int right = matrix.length * matrix[0].length - 1;// ending index is N x M - 1
        while(left < right) { // till left is less than right
            int mid = left + (right - left) / 2;
            int pivot = matrix[mid / matrix[0].length][mid % matrix[0].length];
            // so pivot is basically how many rows plus how many left over
            if(pivot < target) { // if pivot less
                left = mid + 1;// adjust left
            } else {
                right = mid;// else make mid as new right
            }
        }
        return matrix[right / matrix[0].length][right % matrix[0].length] == target;
    }
}
