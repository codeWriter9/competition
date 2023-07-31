package org.competition.leetcode.array;

import java.util.Arrays;

public class LongestHarmoniousSequence {

    public int findLHS(int[] nums) {
        int lhs = 0;
        Arrays.sort(nums);
        int previous = 1;
        for (int index = 0; index < nums.length; index++) {
            int count = 1;
            if (index > 0 && nums[index] == nums[index - 1] + 1) {
                while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
                    count++;
                    index++;
                }
                lhs = Math.max(lhs, previous + count);
                previous = count;
            } else {
                while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
                    count++;
                    index++;
                }
                previous = count;
            }
        }
        return lhs;
    }
}
