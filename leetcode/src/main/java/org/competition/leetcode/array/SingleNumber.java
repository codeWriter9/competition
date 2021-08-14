package org.competition.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] ints) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int i :ints) {
            if(!frequency.containsKey(i)) frequency.put(i, 1);
            else frequency.put(i, frequency.get(i) + 1);
        }
        for(int i :ints) {
            if(frequency.get(i) == 1) return i;
        }
        return 0;
    }

    public int singleNumberUsingXOR(int[] ints) {
        int sum = 0;
        for(int i :ints) {
            sum = sum ^ i;
        }
        return sum;
    }
}
