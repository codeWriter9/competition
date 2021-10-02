package org.competition.leetcode.array;

import static java.util.Arrays.sort;

public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        sort(nums1);
        return nums1;
    }
}