package org.competition.leetcode.array;

public class SortByParity {

    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        int evenCursor = 0;
        while(index < nums.length) {
            if(nums[index] % 2 == 0) {
                int temp = nums[evenCursor];
                nums[evenCursor] = nums[index];
                nums[index] = temp;
                evenCursor++;
            }
            index++;
        }
        return nums;
    }

}
