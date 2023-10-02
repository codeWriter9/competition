package org.competition.leetcode.array;

import java.util.Arrays;

public class SmallestRange {

    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length == 1) return 0;
        else {
            int min = nums[0];// because sorted so min is at 0
            int max = nums[nums.length - 1];// max is at last index
            int diff = max - min;// difference between max and min
            if(diff > 2 * k) return diff - 2 * k;
            else return 0;
        }
    }
}
