package org.competition.leetcode.binarysearch;

public class HIndex {

    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length - 1;
        while(low <= high) { // until low reaches high
            int mid = low + (high - low) / 2;
            if(citations[mid] == citations.length - mid) return citations.length - mid;
            else if(citations[mid] < citations.length - mid) { // until f(citations[hIndex]) is less than hIndex there might be a higher hIndex
                low = mid + 1;// increase the lower bound
            } else {
                high = mid -1;// set upper bound
            }
        }
        return citations.length - low;// gap between low and high
    }
}
