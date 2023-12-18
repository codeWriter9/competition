package org.competition.leetcode.math;

public class SortColors {

    public void sortColors(int[] nums) {
        int[] count = new int[3];// this will hold the count of 0s, 1s and 2s
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;// increment the count of the number at index i
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) { // for all counts
            while (count[i] > 0) { // until the count is greater than 0
                nums[index++] = i;// set to the original array
                count[i]--;// decrement the count
            }
        }
    }
}
