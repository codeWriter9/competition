package org.competition.leetcode.binarysearch;

public class DuplicateNumber {

    /**
     * @param nums
     * @return
     */
    @Deprecated
    public int findDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) { // from start to end
            int mid = start + (end - start) / 2; // find a mid-point
            int count = 0;
            for (int i = 0; i < nums.length; i++) { // are there
                if (nums[i] <= mid) count++; // numbers 'more' than 'mid'
            }
            if (count <= mid) { // if count of numbers is greater than mid -> search in [mid + 1, end]
                start = mid + 1;// as count of numbers strictly greater than mid is less
            } else { // else search in [start, mid]
                end = mid;
            }
        }
        return start;// return the duplicate
    }

    /**
     * The original method supplied by one of the LC Users
     *
     * @param nums
     * @return
     */
    @Deprecated
    public int findDuplicate_bs(int[] nums) {
        int len = nums.length;
        int low = 1;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }

            if (cnt <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
