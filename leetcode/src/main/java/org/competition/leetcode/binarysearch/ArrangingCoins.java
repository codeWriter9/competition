package org.competition.leetcode.binarysearch;

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        if(n == 1) return 1;
        int rows = 0;
        int step = 1;
        while(n > 0) {
            if(n - step >= 0) {
                n -= step;
                rows++;
            }
            else break;
            step++;
        }
        return rows;
    }

    public int arrangeCoinsBinarySearch(int n) {
        long left = 0;
        long right = n;
        while(left <= right) {
            long pivot = left + (right - left) / 2;
            long current = pivot * (pivot + 1) / 2;
            if(current == n) return (int) pivot;
            if(n < current) right = pivot - 1;
            else left = pivot + 1;
        }
        return (int) right;
    }
}
