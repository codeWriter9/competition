package org.competition.leetcode.math;

public class LargestUniqueNumber {

    public int largestUniqueNumber(int[] nums) {
        int [] frequency = new int[1001];
        for(int i = 0; i < nums.length; i++) {
            frequency[nums[i]]++;
        }
        int highestSingle = -1;
        for(int count=frequency.length - 1;count >= 0;count--) {
            if(frequency[count] == 1) {
                highestSingle = count;
                break;
            }
        }
        return highestSingle;
    }
}
