package org.competition.leetcode.array;

public class RemoveDuplicates2 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slow =0;
        int count = 1;
        for(int fast=1;fast<nums.length;fast++) {
            if(nums[slow] == nums[fast]) {// if identical
                count++;// increment
            } else {
                count = 1;//else reset
            }
            if(count <= 2) {//only if count is less/equal than 2
                slow++;
                nums[slow] = nums[fast];//overwrite
            }
        }
        return slow + 1;
    }
}
