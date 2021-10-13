package org.competition.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * Not Optimal Solution
 *
 *
 */
public class LongestPalindromeSubstring {

    Map<Integer, String> map = new HashMap<>();

    /**
     *
     *
     * TODO Find Optimal DP Solution
     *
     * @param s String
     * @return String
     */
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        else {
            int max = -1;
            char[] array = s.toCharArray();
            for (int start = 0; start < s.length(); start++) {
                for (int end = 0; end < s.length(); end++) {
                    if (isPalindrome(array, start, end)) {
                        int length = end - start;
                        if (length > max) {
                            map.put(length, s.substring(start, end + 1));
                            max = length;
                        }
                    }
                }
            }
            return max != -1 ? map.get(max) : "";
        }
    }

    private boolean isPalindrome(char[] array, int start, int end) {
        while (start < end) {
            if (array[start] != array[end]) return false;
            start++;
            end--;
        }
        return true;
    }


}