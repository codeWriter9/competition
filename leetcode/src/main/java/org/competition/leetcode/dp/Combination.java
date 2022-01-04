package org.competition.leetcode.dp;

import java.util.LinkedList;
import java.util.List;

public class Combination {


    public void backtrack(int n, int k, int first, LinkedList<Integer> curr, List<List<Integer>> output) {
        if (curr.size() == k)         // if the combination is done
            output.add(new LinkedList(curr));

        for (int i = first; i < n + 1; ++i) {
            curr.add(i);// add i into the current combination
            backtrack(n, k, i + 1, curr, output);// use next integers to complete the combination
            curr.removeLast();// backtrack
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new LinkedList();
        backtrack(n, k, 1, new LinkedList<>(), output);
        return output;
    }
}