package org.competition.leetcode.dp;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;

public class CombinationSum {

    private void backTrack(int [] candidates, int target, int first,
                           LinkedList<Integer> current, List<List<Integer>>
                                          combinationSum) {
        if(target < 0) {
            return;
        }
        if(target == 0) {
            combinationSum.add(new ArrayList<>(current));
        }
        else {
            for(int index=first;index<candidates.length;index++) {
                current.add(candidates[index]);
                backTrack(candidates, target - candidates[index], index, current, combinationSum);
                current.removeLast();
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comSum = new ArrayList<>();
        LinkedList current = new LinkedList<>();
        backTrack(candidates, target, 0, current, comSum);
        return comSum;
    }

    protected void backtrack(
            int remain,
            LinkedList<Integer> comb,
            int start, int[] candidates,
            List<List<Integer>> results) {

        if (remain == 0) {
            // make a deep copy of the current combination
            results.add(new ArrayList<Integer>(comb));
            return;
        } else if (remain < 0) {
            // exceed the scope, stop exploration.
            return;
        }

        for (int i = start; i < candidates.length; ++i) {
            // add the number into the combination
            comb.add(candidates[i]);
            this.backtrack(remain - candidates[i], comb, i, candidates, results);
            // backtrack, remove the number from the combination
            comb.removeLast();
        }
    }

    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();

        this.backtrack(target, comb, 0, candidates, results);
        return results;
    }
}
