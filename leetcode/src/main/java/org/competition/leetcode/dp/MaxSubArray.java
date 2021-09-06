package org.competition.leetcode.dp;

import static java.lang.Math.max;

public class MaxSubArray {


    public int maxSubArray(int[] ints) {
        if(ints != null && ints.length > 0) { // check if the nums is not null or empty
            int maxSubArray = ints[0];// set first element as global maxima
            int currentSubArray = ints[0];// set first element as local maxima
            for(int i=1;i<ints.length;i++) {// for all elements in array
                currentSubArray = max(ints[i], ints[i] + currentSubArray);// check if adding the current element lessens the sum
                maxSubArray = max(maxSubArray, currentSubArray);// check if current sum is less than the global sum
            }
            return maxSubArray;// return the global maxima
        }
        return 0;// if array is null return 0
    }
}
