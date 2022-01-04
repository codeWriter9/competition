package org.competition.leetcode.array;

import java.util.*;

import static java.util.Arrays.sort;
import static java.util.function.Function.identity;

public class FindMissingNumber {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missed = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        sort(nums);
        for (int num : nums) {
            frequency.computeIfAbsent(num, identity());
        }
        int max = nums.length;
        for (int i = 1; i <= max; i++) {
            if (!frequency.containsKey(i)) missed.add(i);
        }
        return missed;
    }
}