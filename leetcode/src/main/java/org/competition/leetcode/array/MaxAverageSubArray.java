package org.competition.leetcode.array;

public class MaxAverageSubArray {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        int maxSubArray = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSubArray = Math.max(maxSubArray, sum);
        }
        return maxSubArray * 1.0 / k;
    }
}
