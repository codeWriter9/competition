package org.competition.leetcode.dp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PowerSet {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> collections = new ArrayList<>();
        backTrack(nums, new LinkedList<>(), collections, 0);
        return collections;
    }

    public void backTrack(int[] n, LinkedList<Integer> curr, List<List<Integer>> output, int first) {
        output.add(new LinkedList(curr));
        for (int i = first; i < n.length; ++i) {
            curr.add(n[i]);// add i into the current combination
            backTrack(n, curr, output, i + 1);// use next integers to complete the combination
            curr.removeLast();// backtrack
        }
    }
}
