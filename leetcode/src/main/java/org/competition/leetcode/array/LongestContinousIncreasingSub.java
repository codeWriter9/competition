package org.competition.leetcode.array;

public class LongestContinousIncreasingSub {
    public int findLengthOfLCIS(int[] nums) {
        int length = 1;
        int maxLength = Integer.MIN_VALUE;
        if(nums.length == 1) return length;
        for(int index=1;index<nums.length;index++) {
            if(nums[index] > nums[index - 1]) {
                length++;
                maxLength = Math.max(maxLength, length);
            }
            else {
                length = 1;
            }
        }
        length = maxLength > 0 ? maxLength : length;
        return length;
    }
}
