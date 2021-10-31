package org.competition.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {


    public int lengthOfLongestSubstring(String s) {
        if (s != null && s.length() == 1) return 1;
        Map<Character, Character> unique = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        if (s != null) {
            char[] array = s.toCharArray();
            while (right < s.length()) {
                if (!unique.containsKey(array[right])) {
                    unique.put(array[right], array[right]);
                    count = Math.max(unique.size(), count);
                    right++;
                } else {
                    unique.remove(array[left++]);
                }
            }
        }
        return count;
    }
}