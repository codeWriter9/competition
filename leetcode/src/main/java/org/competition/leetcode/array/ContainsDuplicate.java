package org.competition.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int number : nums) {
            if(frequency.containsKey(number)) return true;
            else {
                frequency.put(number, 1);
            }
        }
        return false;
    }
}
