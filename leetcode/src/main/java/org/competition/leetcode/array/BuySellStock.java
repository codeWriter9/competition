package org.competition.leetcode.array;

public class BuySellStock {

    public int maxProfit(int[] ints) {
        int globalProfit = 0;
        int maxProfit;
        int i = 0;
        while (i < ints.length) {
            while (i + 1 < ints.length && ints[i] >= ints[i + 1]) i++;
            int valley = ints[i];
            while (i + 1 < ints.length && ints[i] < ints[i + 1]) i++;
            int peak = ints[i];
            maxProfit = (peak - valley);
            globalProfit = maxProfit + globalProfit;
            i++;
        }
        return globalProfit;
    }
}
