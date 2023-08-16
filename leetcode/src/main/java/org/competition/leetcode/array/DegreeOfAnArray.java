package org.competition.leetcode.array;

import java.util.*;

public class DegreeOfAnArray {

//    public int findShortestSubArray(int[] nums) {
//        Map<Integer, Integer> count = new HashMap<>();
//        Map<Integer, Integer> left = new HashMap<>();
//        Map<Integer, Integer> right = new HashMap<>();
//        for(int index=0;index<nums.length;index++) {
//            int x = nums[index];
//            if(left.get(x) == null) {
//                left.put(x, index);
//            }
//            right.put(x, index);
//            count.put(x, count.getOrDefault(x, 0) + 1);
//        }
//        int ans = nums.length;
//        int degree = Collections.max(count.values());
//        for(int keys : count.keySet()) {
//            if(count.get(keys) == degree) {
//                ans = Math.min(ans, right.get(keys) - left.get(keys) + 1);
//            }
//        }
//        return ans;
//    }

    public int findShortestSubArray(int [] nums) {
        Map<Integer, List<Integer>> frequencyAndIndexMap = new HashMap<>();
        int ans = -1;
        for(int index=0;index<nums.length;index++) {
            int x = nums[index];
            if(frequencyAndIndexMap.get(x) == null) {
                List<Integer> list = new LinkedList<>();
                list.add(1);
                list.add(index);
                list.add(index);
                frequencyAndIndexMap.put(x, list);
            } else {
                frequencyAndIndexMap.get(x).set(0, frequencyAndIndexMap.get(x).get(0) + 1);
                frequencyAndIndexMap.get(x).set(2, index);
            }
        }
        int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        for(List<Integer> lst : frequencyAndIndexMap.values()) {
            if(lst.get(0) > degree) {
                degree = lst.get(0);
                res = lst.get(2) - lst.get(1) + 1;
            } else if(lst.get(0) == degree) {
                res = Math.min(res, lst.get(2) - lst.get(1) + 1);
            }
        }
        return res;
    }

}
