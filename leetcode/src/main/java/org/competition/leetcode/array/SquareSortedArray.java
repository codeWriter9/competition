package org.competition.leetcode.array;

public class SquareSortedArray {

    public int[] squareSortedArray(int[] nums) {
        int [] result = new int[nums.length];
        int pIndex = nums.length;
        for(int index =0;index<nums.length;index++) {
            if(nums[index] >= 0) {
                pIndex = index;
                break;
            }
        }
        int nIndex = (pIndex - 1) > -1 ? (pIndex - 1) : -1;
        pIndex = pIndex < nums.length ? pIndex : nums.length;
        int index = 0;
        while(pIndex < nums.length || nIndex > -1) {
            if(pIndex < nums.length && nIndex > -1) {
                if(Math.abs(nums[pIndex]) > Math.abs(nums[nIndex])) {
                    result[index++] = nums[nIndex] * nums[nIndex];
                    nIndex--;
                }
                else {
                    result[index++] = nums[pIndex] * nums[pIndex];
                    pIndex++;
                }
            }
            else if(pIndex < nums.length) {
                result[index++] = nums[pIndex] * nums[pIndex];
                pIndex++;
            }
            else {
                result[index++] = nums[nIndex] * nums[nIndex];
                nIndex--;
            }
        }
        return result;
    }

}
