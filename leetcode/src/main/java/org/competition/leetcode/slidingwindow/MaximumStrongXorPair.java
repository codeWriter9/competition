package org.competition.leetcode.slidingwindow;

public class MaximumStrongXorPair {

    /**
     *
     * Peculiar case where a O(n^2) solution is accepted and is faster than a O(n) sliding window solution
     *
     * @param nums
     * @return
     */
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        for(int outer=0;outer<nums.length;outer++){ // n times
            for(int inner=outer+1;inner<nums.length;inner++){ // n times O(n^2)
                if(Math.abs(nums[outer] - nums[inner]) < Math.min(nums[outer], nums[inner])) { // this short circuits the loop
                    max = Math.max(max, nums[outer] ^ nums[inner]);
                }
            }
        }
        return max;
    }
}
