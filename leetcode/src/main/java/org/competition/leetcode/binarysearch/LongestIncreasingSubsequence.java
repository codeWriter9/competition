package org.competition.leetcode.binarysearch;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int [] b = new int[nums.length];// create another Array
        int k = 0;// have a incrementer
        b[k] = nums[0];// copy
        for(int i=1;i<nums.length;i++) {
            if(nums[i] < b[k]) { // if current is less than head
                int lower = 0;// it starts with zero
                int upper = k;// it ends with k discovered ranges
                int target = nums[i];// this is the number to be placed
                while(lower <= upper) { // do binary search
                    int mid = lower + (upper - lower) / 2; // find mid
                    if(b[mid] < target) lower = mid + 1;// adjust lower
                    else upper = mid - 1;// adjust upper
                }
                b[lower] = target;// secure the target
            }
            else if(b[k] != nums[i]) { // if the target is not equal
                b[++k] = nums[i];// must be greater so just copy
            }
        }
        return k+1;// end is always longer by 1
    }
}
