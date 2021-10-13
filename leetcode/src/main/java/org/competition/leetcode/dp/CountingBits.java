package org.competition.leetcode.dp;

public class CountingBits {

    public int[] countBits(int n) {
        int [] array = new int[n + 1];
        for(int i=0;i<=n;i++) {
            array[i] = count(i);
        }
        return array;
    }

    private int count(int n) {
        int sum = 0;
        while(n != 0) {
            sum += (n & 1);// AND op to capture the ones and add to sum
            n >>= 1;// right shift
        }
        return sum;
    }

}