package org.competition.leetcode.array;

import java.util.*;

public class ThirdMax {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int index=nums.length - 1;index>=0;index--) {
            set.add(nums[index]);
            if(set.size() >= 3) break;
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(list.size() >= 3) return list.get(0);
        else return nums[nums.length - 1];
    }

}
