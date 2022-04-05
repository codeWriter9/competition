package org.competition.leetcode.recursive;

import java.util.Arrays;

import static java.util.Arrays.fill;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        //Eg , coin 1,2,5 amount 11
        //ways[11] = way[11 - 5] + 1 or way[11 - 2] + 1 or way[11 - 1] + 1
        //         = way[6] + 1   or  way[9] + 1  or  way[10] + 1
        //         = (way[6] + 1) or (way[9] + 1) or (way[10] + 1)
        //         = (way[6 - 5] + 1 or way[6 - 2] + 1 or way[6 - 1] + 1 + 1)
        //                     or (way[9 - 5] + 1 + way[9 - 2] + 1 + way[9 - 1] + 1 + 1)
        //                     or (way[10 - 5] + 1 + way[10 - 2] + 1 + way[10 - 1] + 1 + 1)
        //         = (way[1] + 1 or way[4] + 1 or way[5] + 1 + 1)
        //                     or (way[4] + 1 + way[7] + 1 + way[8] + 1 + 1)
        //                     or (way[5] + 1 + way[8] + 1 + way[9] + 1 + 1)
        //         = (way[1] + 1 or (way[4]) + 1 or (way[5]) + 1 + 1)
        //                     or ((way[4]) + 1 + (way[7]) + 1 + (way[8]) + 1 + 1)
        //                     or ((way[5]) + 1 + (way[8]) + 1 + (way[9]) + 1 + 1)


        //ways[4] = way[4 - 2] + 1 or way[4 - 1] + 1
        //ways[4] = way[2] + 1 or way[3] + 1
        //ways[4] = way[2] + 1 or (way[3]) + 1
        //ways[4] = way[2] + 1 or (way[3 - 2] + 1 + way[3 - 1] + 1) + 1
        //ways[4] = way[2] + 1 or (way[1] + 1 + way[2] + 1) + 1
        //ways[4] = way[2] + 1 or ((way[1]) + 1 + (way[2]) + 1) + 1
        //ways[4] = way[2] + 1 or ((way[1 - 1] + 1) + 1 + (way[2 - 2] + 1 + way[2 - 1] + 1) + 1) + 1
        //ways[4] = way[2] + 1 or ((way[0] + 1) + 1 + (way[0] + 1 + way[2 - 1] + 1) + 1) + 1


        int[] ways = new int[amount + 1]; //initial array for tracking our counted coin

        fill(ways, amount + 1); // fill ways arr with amount + 1 this is for check if there is no coins -1

        ways[0] = 0; // initial 0 , simple case if amount is 0 then the coin is 0
        System.out.println("Memo=" + Arrays.toString(ways));

        //loop amount as parent because we want to check how many coin for the amount
        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {

            // loop coin
            for (int coin : coins) {
                //and check is coin less than current amount
                if (coin <= currentAmount) {//we want minimum coin so we use Math min , and find counted coin in the ways
                    System.out.println("currentAmount=" + currentAmount + "|coin=" + coin + "|ways[" +
                            currentAmount + "]=" + ways[currentAmount] + "|ways[" +
                            (currentAmount - coin) + "]=" + ways[currentAmount - coin]);
                    ways[currentAmount] = Math.min(ways[currentAmount], 1 + ways[currentAmount - coin]);
                    System.out.println("ways[" + currentAmount + "]=" + ways[currentAmount]);
                }

            }
        }

        // if the last index is bigger than amount , means there is no coin match with the amount return -1
        return ways[amount] > amount ? -1 : ways[amount];
    }
}