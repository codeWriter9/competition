package org.competition.leetcode.array;

public class DuplicateNumber {

    public int findDuplicate(int[] nums) {
        int [] count = new int[nums.length];
        for(int i =0;i<nums.length;i++){ // check for all elements
            count[nums[i]]++;
            if(count[nums[i]]>1){
                return nums[i];// will always return from here
            }
        }
        return -1;// never here
    }
}
