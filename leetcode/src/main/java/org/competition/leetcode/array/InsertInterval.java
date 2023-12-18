package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * TODO: Complete This
 *
 */
public class InsertInterval {

    public static final int START = 0;
    public static final int END = 1;

    boolean isOverlapping(int[] interval1, int[] interval2) {
        return Math.min(interval1[START], interval1[END]) - Math.max(interval2[START], interval2[END]) >= 0;
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

        // If there is no interval with a greater value of start value,
        // then the interval must be inserted at the end of the list.
        if (!isIntervalInserted) {
            list.add(newInterval);
        }

        return list.toArray(new int[list.size()][2]);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        System.out.println("=====================");
        intervals = insertInterval(intervals, newInterval);
        for(int [] interval : intervals) {
            System.out.println(Arrays.toString(interval));
            System.out.println("");
        }
        List<int[]> answer = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(" intervals[" + i + "] = " + Arrays.toString(intervals[i]));
            int[] currInterval = {intervals[i][START], intervals[i][END]};
            System.out.println(" current Interval = " + Arrays.toString(currInterval));
            // Merge until the list gets exhausted or no overlap is found.
            while (i < intervals.length && isOverlapping(currInterval, intervals[i])) {
                currInterval = merge(currInterval, intervals[i]);
                i++;
            }
            // Decrement to ensure we don't skip the interval due to outer for-loop incrementing.
            i--;
            answer.add(currInterval);
            if(length > 10) {
                break;
            }
            else length++;
        }
        return answer.toArray(new int[answer.size()][2]);
    }
}
