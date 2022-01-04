package org.competition.leetcode.array;

public class BinarySearch {

    public int searchAnotherWay(int [] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int mid = (int)Math.floor((left + right) / 2);
            if(nums[mid] < target) {
                left = left + 1;
            }
            else if(nums[mid] > target) {
                right = right - 1;
            }
            else return mid;
        }
        return index;
    }

    public int search(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(mid >= nums.length) break;
            if(nums[mid] == target) {
                index  = mid;
                break;
            }
            else if(nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return index;
    }

}