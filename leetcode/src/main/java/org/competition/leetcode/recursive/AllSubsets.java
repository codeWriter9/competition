package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {

    public void findSubsets(List<List<Integer>> subset, List<Integer> nums, List<Integer> output, int index) {
        if(index == nums.size()) {
            subset.add(output);// Add the current set to the list of Subsets
            return ;
        }
        // skipping the current element at index
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);

        // take the current element at index
        output.add(nums.get(index));

        // Find next elements
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
    }
}
