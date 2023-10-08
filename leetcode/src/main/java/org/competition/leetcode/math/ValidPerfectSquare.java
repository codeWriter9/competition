package org.competition.leetcode.math;

/**
 *
 *
 *
 */
public class ValidPerfectSquare {

    /**
     *
     * using Binary Search
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true; // if num ==1 return true
        long left = 2;// start from 2
        long right = num / 2; // end at half of num
        while(left <= right) { // while window between left and right is valid
            long mid = left + (right - left) / 2;// find mid point
            if(mid * mid == num) return true;// if mid * mid == num return true
            else if(mid * mid > num) right = mid - 1;// reduce right window
            else left = mid + 1;// increase left window
        }
        return false;// if not found return false
    }
}
