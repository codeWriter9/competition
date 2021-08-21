package org.competition.leetcode.dp;

import static java.lang.Math.max;

public class MaxSubArray {


    public int maxSubArray(int[] ints) {
        if(ints != null && ints.length > 0) {
            int maxSubArray = ints[0];
            int currentSubArray = ints[0];
            for(int i=1;i<ints.length;i++) {
                currentSubArray = max(ints[i], ints[i] + currentSubArray);// check if adding the current element lessens the sum
                maxSubArray = max(maxSubArray, currentSubArray);// check if current sum is less than the global sum
            }
            return maxSubArray;
        }
        return 0;
    }
}
