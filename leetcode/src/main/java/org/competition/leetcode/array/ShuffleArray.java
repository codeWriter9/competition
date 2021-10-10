package org.competition.leetcode.array;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ShuffleArray {

    private int[] nums;

    ShuffleArray(int[] nums) {
        this.nums = nums;
    }

    private int random() {
        return new Random().nextInt(nums.length);
    }

    public int[] shuffle() {
        int[] copy = new int[nums.length];

        Set<Integer> visited = new HashSet<>();
        int current = 0;
        while (visited.size() < copy.length) {
            int index = random();
            if (!visited.contains(index)) {
                copy[current++] = nums[index];
                visited.add(index);
            }
        }

        return copy;
    }

    public int[] reset() {
        return nums;
    }
}