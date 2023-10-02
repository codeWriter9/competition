package org.competition.leetcode.array;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for(int index=1;index<nums.length;index++) {
            if(nums[index] > nums[index - 1]) isIncreasing = true;
            if(nums[index] < nums[index - 1]) isDecreasing = true;
            if(isDecreasing && isIncreasing) return false;
        }
        return true;
    }

}
