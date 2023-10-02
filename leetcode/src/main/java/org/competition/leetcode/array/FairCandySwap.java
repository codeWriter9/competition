package org.competition.leetcode.array;

/**
 *
 * TODO - implement this using only 1 for loop
 *
 */
public class FairCandySwap {

    /**
     *
     * TODO - implement this using only 1 for loop
     *
     * @param aliceSizes
     * @param bobSizes
     * @return
     */
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum=0;
        int bobSum=0;
        for(int alice : aliceSizes) {
            aliceSum+=alice;
        }
        for(int bob : bobSizes) {
            bobSum+=bob;
        }
        for(int alice=0;alice<aliceSizes.length;alice++) {
            for(int bob=0;bob<bobSizes.length;bob++) {
                if(aliceSum - aliceSizes[alice] + bobSizes[bob]
                        == bobSum  + aliceSizes[alice] - bobSizes[bob]
                ) return new int[]{aliceSizes[alice], bobSizes[bob]};
            }
        }
        return new int[]{-1, -1};
    }
}
