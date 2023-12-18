package org.competition.leetcode.dp;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount];
        return func(coins, amount, dp);
    }

    int func(int [] coins, int amount, int [] dp) {
        if(amount == 0) {
            return 0;
        }
        if(amount < 0) {
            return -1;
        }
        System.out.println("amount = " + amount + " dp[" + (amount - 1) + "] = " + dp[(amount - 1)]);
        if (dp[amount - 1] != 0) return dp[amount - 1];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++) {
            System.out.println("amount = " + amount + " coins[" + i + "] = " + coins[i]);
            int res = func(coins, amount - coins[i], dp);
            System.out.println("res = " + res + " coins[" + i + "] = " + coins[i]);
            if(res >= 0 && res < min) {
                min = 1 + res;
            }
            System.out.println("min = " + min + " coins[" + i + "] = " + coins[i]);
        }
        dp[amount - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        System.out.println("dp = " + Arrays.toString(dp));
        return dp[amount - 1];
    }
}
