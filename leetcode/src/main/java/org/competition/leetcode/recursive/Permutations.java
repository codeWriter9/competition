package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;
import static java.util.Collections.swap;

public class Permutations {

    public List<List<Integer>> permute(List<Integer> nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (nums == null || nums.size() == 0) return permutations;// if there are no numbers then it there are no permutations
        return permute(permutations, nums, new ArrayList<>(), new boolean[nums.size()]);// return the permutations
    }

    private List<List<Integer>> permute(List<List<Integer>> permutations, List<Integer> nums, List<Integer> current,
                                        boolean[] visited) {
        if (nums.size() == current.size()) {// if all the numbers are taken
            permutations.add(current);// add the current permutation to the list of permutation
            return permutations;// return
        }
        for (int i = 0; i < nums.size(); i++) { // for all elements
            if (visited[i]) continue;// check if visited
            visited[i] = true;// set element marked as taken
            current.add(nums.get(i));// Add element
            permute(permutations, nums, new ArrayList<>(current), visited);// permute for next
            current.remove(Integer.valueOf(nums.get(i)));// remove the element
            visited[i] = false;// mark the senitel as false
        }
        return permutations; // return
    }


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