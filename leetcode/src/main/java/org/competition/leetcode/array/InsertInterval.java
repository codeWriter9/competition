package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 *
 *
 */
public class InsertInterval {

    public static final int START = 0;
    public static final int END = 1;

    boolean isOverlapping(int[] interval1, int[] interval2) {
        return Math.min(interval1[END], interval2[END]) - Math.max(interval1[START], interval2[START]) >= 0;
    }

    int[] merge(int[] interval1, int[] interval2) {
        return new int[]{Math.min(interval1[START], interval2[START]), Math.max(interval1[END], interval2[END])};
    }

    int[][] insertInterval(int[][] intervals, int[] newInterval) {
        boolean isIntervalInserted = false;
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));

        for (int i = 0; i < intervals.length; i++) {
            if (newInterval[0] < intervals[i][0]) {
                // Found the position, insert the interval and break from the loop.
                list.add(i, newInterval);
                isIntervalInserted = true;
                break;
            }
        }
        if (!isIntervalInserted) { // not found in the loop, insert at the end.
            list.add(newInterval);
        }
        return list.toArray(new int[list.size()][2]);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        intervals = insertInterval(intervals, newInterval);// get the interval added
        List<int[]> answer = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] currInterval = {intervals[i][START], intervals[i][END]};
            while (i < intervals.length && isOverlapping(currInterval, intervals[i])) {
                currInterval = merge(currInterval, intervals[i]);
                i++;
            }
            // Decrement to ensure we don't skip the interval due to outer for-loop incrementing.
            i--;
            answer.add(currInterval);
        }
        return answer.toArray(new int[answer.size()][2]);
    }
}