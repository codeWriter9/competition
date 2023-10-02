package org.competition.leetcode.array;

public class SortByParity2 {

    public int[] sortArrayByParityII(int[] nums) {
        int evenCounter = 0;
        int oddCounter = 1;
        for(;oddCounter<nums.length && evenCounter<nums.length;) {
            if(nums[evenCounter] % 2 == 0) {// if already even skip
                evenCounter += 2;
            } else if(nums[oddCounter] % 2 != 0) {// if already odd skip
                oddCounter += 2;
            } else { // else swap
                int temp = nums[evenCounter];
                nums[evenCounter] = nums[oddCounter];
                nums[oddCounter] = temp;
                evenCounter += 2;
                oddCounter += 2;
            }
        }
        return nums;
    }
}
