package org.competition.leetcode.math;

import static java.util.Arrays.sort;

public class HIndex {
    public int hIndex(int[] citations) {
        sort(citations);// so that max citations are at the end
        int hIndex = 0;// re use this as index of citations array and hIndex
        while (hIndex < citations.length && citations[citations.length - 1 - hIndex] > hIndex) // while
            // hIndex in in array
            // hIndex is less that citations[length of array - hIndex]
            hIndex++;// increment hIndex
        return hIndex;
    }
}
