package org.competition.leetcode.dp;

import java.util.*;

public class UniqueCombinationSum {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinationSum = new ArrayList<>();
        Arrays.sort(candidates);
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int candidate : candidates)
            frequency.compute(candidate, (cndt, frqncy) -> frqncy == null ? 1 : frqncy + 1);
        List<int[]> counterList = new ArrayList<>();
        frequency.forEach((key, value) -> {
            counterList.add(new int[]{key, value});
        });
        backTrack(candidates, combinationSum, new LinkedList<>(), 0, target, new HashSet<>(), counterList);
        return combinationSum;
    }

    private void backTrack(int [] candidates,
                           List<List<Integer>> combinationSum,
                           LinkedList<Integer> current,
                           int first, int target,
                           Set<String> dp,
                           List<int [] > counter) {
        if(target == 0) {
            combinationSum.add(new LinkedList<>(current));
            return;
        }
        if(target <= 0) return;
        for(int index=first;index<counter.size();index++) {
            int[] entry = counter.get(index);
            Integer candidate = entry[0], freq = entry[1];

            if (freq <= 0)
                continue;

            // add a new element to the current combination
            current.addLast(candidate);
            counter.set(index, new int[]{candidate, freq - 1});

            // continue the exploration with the updated combination
            backTrack(candidates, combinationSum, current, index, target - candidate, dp, counter);


            // backtrack the changes, so that we can try another candidate
            counter.set(index, new int[]{candidate, freq});
            current.removeLast();
        }
    }
}
