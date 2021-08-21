package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;
import static java.util.Collections.swap;

public class Permutations {

    public List<List<Integer>> permute(List<Integer> nums, List<List<Integer>> permutation, int index) {
        permutation.add(new ArrayList(nums));
        int k = largestK(nums);
        while (k != -1) {
            int l = largestL(nums, k);
            swap(nums, l, k);
            List<Integer> subList = new ArrayList<>(nums.subList(k + 1, nums.size()));
            reverse(subList);
            int count = 0;
            for (int i = k + 1; i < nums.size(); i++) {
                nums.set(i, subList.get(count++));
            }
            permutation.add(new ArrayList(nums));
            k = largestK(nums);
        }
        return permutation;
    }

    private int largestL(List<Integer> nums, int k) {
        int l = 0;
        int largestL = -1;
        while (l < nums.size()) {
            if (nums.get(l) > nums.get(k) && largestL < l) {
                largestL = l;
            }
            l++;
        }
        return largestL;
    }

    private int largestK(List<Integer> nums) {
        int k = 0;
        int largestK = -1;
        while (k + 1 < nums.size()) {
            if (nums.get(k) < nums.get(k + 1) && largestK < k) {
                largestK = k;
            }
            k++;
        }
        return largestK;
    }


}