package org.competition.leetcode.recursive;


import static java.util.Arrays.copyOf;

public class MergeSort {

    public void sortArray(int[] nums) {
        int[] copy = copyOf(nums, nums.length);
        split(copy, 0, nums.length, nums);
    }

    void split(int[] copy, int start, int end, int[] original) {
        if (end - start <= 1) {
            return;
        }
        int mid = (start + end) / 2;
        split(original, start, mid, copy);
        split(original, mid, end, copy);
        merge(copy, start, mid, end, original);
    }

    void merge(int[] original, int start, int mid, int end, int[] copy) {
        int lCursor = start;
        int rCursor = mid;
        for (int cursor = start; cursor < end; cursor++) {
            if ((lCursor < mid) && (rCursor >= end || original[lCursor] <= original[rCursor])) {
                copy[cursor] = original[lCursor];
                lCursor = lCursor + 1;
            } else {
                copy[cursor] = original[rCursor];
                rCursor = rCursor + 1;
            }
        }
    }
}