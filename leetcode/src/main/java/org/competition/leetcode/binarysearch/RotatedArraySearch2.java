package org.competition.leetcode.binarysearch;

public class RotatedArraySearch2 {

    /**
     *
     * In a rotated array there would be a pivot which is the boundary between sorted and rotated part
     * Our task if to find on which side of pivot the mid point is
     *
     * @param nums
     * @param target
     * @return
     */
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) { // pivot is the boundary between rotated and sorted array
            // Suppose our array is
            // [5, 6, 7, 8, 9, 0, 1, 2, 3, 4]
            // num[0] = 5 to num[4] = 9 is sorted
            // num[5] = 0 to num[9] = 4 is rotated
            // no matter where the mid point is, num[4] = 9 and num[5] = 0 are pivots
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) { // target found bingo!
                return true;
            }
            if((nums[left] == nums[mid]) && (nums[right] == nums[mid])) // because of duplicates
                // there might be a scenario where left, mid and right are same
            {
                left++;// towards mid
                right--;// towards mid
            }
            else if(nums[left] <= nums[mid]) { // left to mid is kind of sorted so pivot is to right of mid
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
