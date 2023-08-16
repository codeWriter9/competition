package org.competition.leetcode.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramMapping {

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, List<Integer>> m1 = new HashMap<Integer, List<Integer>>();
        Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
        for(int index=0;index<nums1.length;index++) {
            if(m1.containsKey(nums1[index])) {
                m1.get(nums1[index]).add(index);
            }
            else {
                List<Integer> list = new java.util.ArrayList<Integer>();
                list.add(index);
                m1.put(nums1[index], list);
            }
        }
        for(int index=0;index<nums2.length;index++) {
            m2.put(nums2[index], index);
        }
        int [] r = new int[nums1.length];
        for(int num : nums1) {
            for(Integer integer : m1.get(num)) {
                r[integer] = m2.get(num);
            }
        }
        return r;
    }
}
