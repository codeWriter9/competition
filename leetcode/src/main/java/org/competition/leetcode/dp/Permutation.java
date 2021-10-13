package org.competition.leetcode.dp;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if(nums == null || nums.length == 0 ) {
            permutations.add(new ArrayList<>());
        }
        else {
            boolean [] visited = new boolean[nums.length];
            permute(nums, permutations, visited, new ArrayList<>());
        }
        return permutations;
    }

    private void permute(int [] nums, List<List<Integer>> permutations, boolean [] visited, List<Integer> currentList) {
        if(currentList.size() == nums.length) {
            permutations.add(currentList);
        }
        else {
            for(int i=0;i<nums.length;i++) {
                if(visited[i]) continue;
                currentList.add(nums[i]);
                visited[i] = true;
                permute(nums, permutations, visited, new ArrayList<>(currentList));
                currentList.remove(Integer.valueOf(nums[i]));
                visited[i] = false;
            }
        }
    }

}