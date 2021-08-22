package org.competition.leetcode.dp;

public class HouseRobber {

    public int rob(int[] nums) {
        int [] memo = new int[nums.length];
        for(int i=0;i<memo.length;i++) memo[i] = -1;
        return rob(nums, 0, memo);
    }

    private int rob(int [] nums, int house, int [] memo) {
        if(house >= nums.length) {
            return 0;
        }
        if(memo[house] > -1) return memo[house];// return if cached
        memo[house] = Math.max(rob(nums, house + 1, memo), rob(nums, house + 2, memo) + nums[house]);
        return memo[house];// else cache and return
    }
}
