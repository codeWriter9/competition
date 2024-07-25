package org.competition.leetcode.slidingwindow;

public class SubstrDistinctChar {

    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int index = 0; index < s.length() - 2; index++) {
            char first = s.charAt(index);
            char second = s.charAt(index + 1);
            char third = s.charAt(index + 2);
            if (first != second && second != third && first != third) {
                count++;
            }
        }
        return count;
    }
}
