package org.competition.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * TODO - this is not working for all test cases
 *
 */
public class LargeGroupPositions {

    /**
     *
     * TODO - this is not working for all test cases
     *
     * @param s
     * @return
     */
    public List<List<Integer>> largeGroupPositions(String s) {
        System.out.println("-- start");
        List<List<Integer>> positions = new ArrayList<>();
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);// start index
            int count = 1;// reset count
            int start = index;
            System.out.println("start: " + (start - 1) + " char: " + (start > 0 ? s.charAt(start - 1) : ""));
            while (index < s.length() && s.charAt(index) == c) {
                count++;
                index++;
                System.out.println("count: " + count + " index: " + (index - 1) + " char: " + (index > 0 ? s.charAt(index - 1) : ""));
            }
            if (count >= 3 && (start - 1) >= 0) { // ony if it is a large group then add
                List<Integer> position = new ArrayList<>();
                position.add(start - 1);// add start
                position.add(index - 1);// add end
                System.out.println("Adding start: " + start + " end: " + (index - 1));
                positions.add(position);// add position to the positions group
                System.out.println("positions " + positions);
            }
        }
        return positions;
    }


}
