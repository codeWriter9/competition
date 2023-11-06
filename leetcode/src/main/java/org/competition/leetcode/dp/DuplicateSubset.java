package org.competition.leetcode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DuplicateSubset {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(subsets, new LinkedList<>(), nums, 0, new ArrayList<>());
        return subsets;
    }

    private void backTrack(List<List<Integer>> subSets,
                           LinkedList<Integer> current,
                           int[] nums,
                           int first,
                           List<String> dp) {
        if(!dp.contains(current.toString())) {
            dp.add(current.toString());
            subSets.add(new LinkedList<>(current));
        }
        for (int index = first; index < nums.length; index++) {
            current.add(nums[index]);
            backTrack(subSets, current, nums, index + 1, dp);
            current.removeLast();
        }
    }
}
