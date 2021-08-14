package org.competition.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumber {
    public int[] sumOfTwoNumber(int[] ints, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for(int loop=0;loop<ints.length;loop++) {
            int complement = target - ints[loop];
            if(complements.containsKey(complement)) {
                return new int[]{complements.get(complement), loop};
            }
            complements.put(ints[loop], loop);
        }
        return null;
    }
}
