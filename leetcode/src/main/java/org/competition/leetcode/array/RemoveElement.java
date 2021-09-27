package org.competition.leetcode.array;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int slowCursor = 0;
        for(int fastCursor =0;fastCursor < nums.length;fastCursor++) {
            if(nums[fastCursor] != val) {//copy only if the element is one to be deleted
                nums[slowCursor] = nums[fastCursor];
                slowCursor++;
            }
        }
        return slowCursor;
    }
}
