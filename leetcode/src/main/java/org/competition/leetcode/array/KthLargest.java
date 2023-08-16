package org.competition.leetcode.array;

import java.util.*;

public class KthLargest {

    private List<Integer> list = new LinkedList<>();
    private Integer k;

    public KthLargest(int k, int[] nums) {
        for (int i : nums) {
            list.add(i);
        }
        this.k = k;
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("list=" + list);
        return list.remove(k - 1);
    }
}
