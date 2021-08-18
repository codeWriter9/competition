package org.competition.leetcode.strings;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 1) string builder
        StringBuilder result = new StringBuilder();

        // Sort array
        sort(strs);

        // split first and last to char
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1 ].toCharArray();

        // loop through
        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] == last[i]) {
                result.append(first[i]);
            }
            else
                return result.toString();
        }
        return result.toString();
    }
}
