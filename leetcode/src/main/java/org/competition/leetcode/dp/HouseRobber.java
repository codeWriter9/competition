package org.competition.leetcode.dp;

import static java.lang.Math.max;
import static java.util.Arrays.fill;

public class HouseRobber {

    public int rob(int[] nums) {
        int [] memo = new int[nums.length];
        fill(memo, -1);
        return rob(nums, 0, memo);
    }

    private int rob(int [] nums, int house, int [] memo) {
        if(house >= nums.length) {
            return 0;
        }
        if(memo[house] > -1) return memo[house];// return if cached
        memo[house] = max(rob(nums, house + 1, memo), rob(nums, house + 2, memo) + nums[house]);
        return memo[house];// else cache and return
    }

    public int robCircle(int[] nums) {
        int [] memo = new int[nums.length];
        fill(memo, -1);
        int firstArc = rob(nums, 0, memo, nums.length - 1);
        int secondArc = rob(nums, 1, memo, nums.length);
        return max(firstArc, secondArc);
    }

    private int rob(int [] nums, int house, int [] memo, int length) {
        if(house >= length) {
            return 0;
        }
        if(memo[house] > -1) return memo[house];// return if cached
        memo[house] = max(rob(nums, house + 1, memo, length), rob(nums, house + 2, memo, length) + nums[house]);
        return memo[house];// else cache and return
    }
}