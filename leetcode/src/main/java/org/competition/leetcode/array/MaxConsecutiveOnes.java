package org.competition.leetcode.array;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnesI(int[] nums) {
        int globalMaxima = 0;
        int localMaxima = 0;
        for(int num : nums) {
            if(num == 1) localMaxima += 1;
            else localMaxima = 0;
            globalMaxima = Math.max(globalMaxima, localMaxima);
        }
        return globalMaxima;
    }

    public int findMaxConsecutiveOnesII(int[] nums) {
        int longestOneSequence = 0;
        int numberOfZeroes = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length) { // if window is within the limit of array
            if(nums[right] == 0) { // if current is zero
                numberOfZeroes++;// we add count of zeroes
            }
            while(numberOfZeroes == 2) { // if we have 2 zero
                if(nums[left] == 0) { // and if current left is zero
                    numberOfZeroes--; // decrease number of zero
                }
                left++;// contract the window
            }
            longestOneSequence = Math.max(longestOneSequence, right - left + 1);
            right++;
        }
        return longestOneSequence;
    }

}