package org.competition.leetcode.dp;

public class MaxProductSubArray {

    public int maxProduct(int[] nums) {
        if (nums != null && nums.length > 0) {
            int globalMaxima = nums[0];
            int localMaxima = nums[0];
            int localMinima = nums[0];
            for(int index = 1; index < nums.length; index++) {
                int tempMaxima = Math.max(nums[index], Math.max(localMaxima * nums[index], localMinima * nums[index]));
                localMinima = Math.min(nums[index], Math.min(localMaxima * nums[index], localMinima * nums[index]));
                localMaxima = tempMaxima;// saved this in temp as localMaxima is needed to calculate localMinima
                globalMaxima = Math.max(globalMaxima, localMaxima);
            }
            return globalMaxima;
        }
        return 0;
    }
}
