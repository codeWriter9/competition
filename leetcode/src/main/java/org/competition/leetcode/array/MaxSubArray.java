package org.competition.leetcode.array;

/**
 *
 *
 * Brute Force - O(N) squared
 *
 */
public class MaxSubArray {

    public int maxSubArray(int [] integers) {
        int maxSubArray = Integer.MIN_VALUE;
        for(int i=0;i<integers.length;i++) {
            int currentSubArray = 0;
            for(int j=i;j<integers.length;j++) {
                currentSubArray += integers[j];
                maxSubArray = Math.max(maxSubArray, currentSubArray);
            }
        }
        return maxSubArray;
    }
}
