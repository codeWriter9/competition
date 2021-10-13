package org.competition.leetcode.dp;

public class MaxInGeneratedArray {

    private int [] array = new int[100 + 1];

    {
        array[0] = 0;
        array[1] = 1;
        for(int index = 1;index < 50;index++) {
            array[2 * index] = array[index];
            array[(2 * index) + 1] = array[index] + array[index + 1];
        }
        array[100] = array[50];
    }

    public int getMaximumGenerated(int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

}