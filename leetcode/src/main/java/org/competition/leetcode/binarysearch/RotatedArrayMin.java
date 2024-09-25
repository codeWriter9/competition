package org.competition.leetcode.binarysearch;

public class RotatedArrayMin {

    /**
     *
     * In a sorted array minimum element is always the first element
     * In a 'rotated' sorted array the first element would be greater than the last element
     * So the only array index which we know for sure is current minimum is the last element
     *
     * @param nums
     * @return
     */
    public int findMin(int [] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) { // left MUST BE less than right for loop to end
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]) { // take consideration that right would min element on first iteration
                right = mid;// the right boundary must contain mid - 1 and mid as
                // we do not know where the pivot is and the min is on right side of pivot
            } else { // pivot is on the right side of mid
                left = mid + 1;// push the left boundary as min can't be in left side
            }
        }
        return nums[left];
    }
}
