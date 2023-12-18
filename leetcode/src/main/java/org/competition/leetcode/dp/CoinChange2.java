package org.competition.leetcode.dp;

import java.util.Arrays;

public class CoinChange2 {

    public int change(int amount, int[] coins) {
        System.out.println("-----");
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        System.out.println("-----");
        System.out.println("1st Stage");
        System.out.println("-----");
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for(int [] array : dp) System.out.println(Arrays.toString(array));

        for (int coinIndex = n - 1; coinIndex >= 0; coinIndex--) {
            for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
                if (coins[coinIndex] > currentAmount) {
                    dp[coinIndex][currentAmount] = dp[coinIndex + 1][currentAmount];
                    System.out.println("dp[" + coinIndex + "][ currentAmount = " + currentAmount + "] = " + dp[coinIndex][currentAmount] + " dp[" + (coinIndex + 1) + "][" + currentAmount + "] = " + dp[coinIndex + 1][currentAmount] + " coins[" + coinIndex + "] = " + coins[coinIndex]);
                } else {
                    dp[coinIndex][currentAmount] = dp[coinIndex + 1][currentAmount] + dp[coinIndex][currentAmount - coins[coinIndex]];
                    System.out.println("dp[" + coinIndex + "][ currentAmount = " + currentAmount + "] = " + dp[coinIndex][currentAmount]
                    + " dp[" + (coinIndex + 1) + "][ currentAmount = " + currentAmount + "] = " + dp[coinIndex + 1][currentAmount]
                    + " dp[" + coinIndex + "][ (currentAmount - coins[coinIndex]) = " + (currentAmount - coins[coinIndex]) + "] = " + dp[coinIndex][currentAmount - coins[coinIndex]]
                    + " coins[" + coinIndex + "] = " + coins[coinIndex]);
                }
            }
        }
        System.out.println("-----");
        System.out.println("Final");
        System.out.println("-----");
        for(int [] array : dp) System.out.println(Arrays.toString(array));
        System.out.println("-----");
        return dp[0][amount];
    }


    /**
     *
     * Just for reference
     *
     * @param i
     * @param amount
     * @param coins
     * @return
     */
    @Deprecated
    public int numberOfWaysRecursive(int i, int amount, int [] coins) {
        if (amount == 0) {
            return 1;
        }
        if (i == coins.length) {
            return 0;
        }

        if (coins[i] > amount) {
            return numberOfWaysRecursive(i + 1, amount, coins);
        }

        return numberOfWaysRecursive(i, amount - coins[i], coins) + numberOfWaysRecursive(i + 1, amount, coins);
    }

    /**
     *
     * Just for reference
     *
     * @param amount
     * @param coins
     * @return
     */
    @Deprecated
    public int changeRecursive(int amount, int[] coins) {
        return numberOfWaysRecursive(0, amount, coins);
    }
}
