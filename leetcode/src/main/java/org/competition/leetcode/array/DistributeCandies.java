package org.competition.leetcode.array;

import java.util.Arrays;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        return (int) Math.min(
                candyType.length / 2,
                Arrays.stream(candyType).distinct().count()
        );
    }
}
