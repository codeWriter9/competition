package org.competition.leetcode.dp;


import static java.lang.Math.min;
import static java.util.Arrays.fill;

enum Index {GOOD, BAD, UNKNOWN}

public class JumpGame {


    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        Index[] memo = new Index[nums.length];
        fill(memo, Index.UNKNOWN);
        memo[memo.length - 1] = Index.GOOD;
        return canJump(nums, 0, memo);
    }

    private boolean canJump(int[] nums, int index, Index[] memo) {
        // reached last index
        if (index >= nums.length - 1) return true;
        if (memo[index] != Index.UNKNOWN) return memo[index] == Index.GOOD;
        // Do not fall off the array!
        int furthestJump = min(nums[index], nums.length - 1);
        // start with the greatest jump
        for (int loop = furthestJump; loop > 0; loop--) {
            // if we reached end then return true
            if (canJump(nums, index + loop, memo)) {
                memo[index] = Index.GOOD;
                return true;
            }
            // else continue
        }
        memo[index] = Index.BAD;
        return false;// if not then false
    }

    public int jump(int[] ints) {
        if (ints.length > 1) {
            jump(ints, 0, 0);
        }
        return 0;
    }

    private int jump(int[] ints, int index, int jump) {
        if (index >= ints.length) return jump;
        int min = Integer.MAX_VALUE;
        for (int canJump = 1; canJump < ints[index] + 1; canJump++) {
            min = Math.min(jump(ints, index + 1, jump + canJump), min);
        }
        return min;
    }
}
