package org.competition.leetcode.bit;

public class ReverseBit {

    public int reverseBits(int n) {
        int num = 0;
        for (int i = 31; i >= 0; i--) {
            num |= (n & 1) << i;//num = num + (extract right most significant digit) << power
            n = n >> 1;// n = n / 2
        }
        return num;
    }
}