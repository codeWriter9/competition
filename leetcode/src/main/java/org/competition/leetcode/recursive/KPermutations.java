package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

public class KPermutations {

    public List<List<Integer>> permute(int [] num, int k) {
        List<List<Integer>> permutations = new ArrayList<>();
        return permute(permutations, num, new ArrayList<>(), new boolean[num.length], k);
    }

    private List<List<Integer>> permute(List<List<Integer>> permutations, int [] num,List<Integer> current, boolean [] visited, int k) {
        if(current.size() == k) { // if current size is K numbers
            permutations.add(current);// Then add to the list of numbers
            return permutations;
        }
        for(int index = 0;index<num.length;index++) {
            if(visited[index]) continue;// already visited so go with next number
            visited[index] = true; // set Visit as True
            current.add(num[index]);// add current number
            permute(permutations, num, new ArrayList<>(current), visited, k);// permute the next number
            current.remove(valueOf(num[index]));
            visited[index] = false;
        }
        return permutations;
    }
}