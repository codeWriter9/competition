package org.competition.leetcode.math;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int expected = (int)(nums.length * (nums.length + 1)) / 2;
        int sum = 0;
        for(int number : nums) sum += number;
        return expected - sum;
    }
}
