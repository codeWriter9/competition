package org.competition.leetcode.binarysearch;

public class RotatedArraySearch {

    public int search(int[] nums, int target) {
        int left = 0;// low
        int right = nums.length;// high
        while(left < right) { // while low is less than high we continue the search
            int mid = left + (right - left) / 2;// get mid
            int pivot = ( // search for pivot **by**
                    nums[mid] < nums[0] // is the mid element part of the folded
                            ==
                            (target < nums[0]) // is the target element part of the folded
                            ?
                            nums[mid] : // if both yes or both no take mid element
                            target < nums[0]  // if they are not equal boolean check if target is part of the folded
                                    ?
                                    Integer.MIN_VALUE : // make the starting elements as negative infinity
                                    Integer.MAX_VALUE);// make the ending elements as positive infinity
            if(pivot < target) {
                left = mid + 1;
            } else if(pivot > target) {
                right = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
