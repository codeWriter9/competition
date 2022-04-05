package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

public class KSubset {

    public List<List<Integer>> subsets(int [] num, int k) {
        List<List<Integer>> subsets = new ArrayList<>();
        if(num.length == 0 && k == 0) return subsets;
        subsets(subsets, num, new ArrayList<>(), k, 0);
        return subsets;
    }

    private void subsets(List<List<Integer>> subsets, int [] num, List<Integer> current, int k, int index) {
        if(index == num.length) { // if current index is equal to count of numbers
            if(current.size() == k) subsets.add(current); // and size of current set is k then add set
            return;
        }
        subsets(subsets, num, new ArrayList<>(current), k, index + 1);// find subset of next number without current number
        current.add(num[index]);// add current number
        subsets(subsets, num, new ArrayList<>(current), k, index + 1);// find subset of next number with current number
    }
}
