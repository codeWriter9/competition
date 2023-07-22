package org.competition.leetcode.math;

import java.util.Arrays;

public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int index = 0; index + 1 < nums.length; index += 2) {
            sum += Math.min(nums[index], nums[index + 1]);
        }
        return sum;
    }
}
