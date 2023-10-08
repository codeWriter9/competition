package org.competition.leetcode.math;

import java.util.Arrays;

public class LargestPermiterTriangle {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int perimeter = 0;
        for(int index=nums.length-1;index>1;index--) {
            if(nums[index - 1] + nums[index -2 ] > nums[index]) {
                return nums[index] + nums[index - 1] + nums[index - 2];
            }
        }
        return perimeter;
    }
}
