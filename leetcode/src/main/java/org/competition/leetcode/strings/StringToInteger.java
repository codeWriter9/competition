package org.competition.leetcode.strings;


import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class StringToInteger {

    public int myAtoi(String str) {
        long x = 0;
        boolean isNegative = false;
        int i = 0;

        while (i < str.length() && str.charAt(i) == ' ') i += 1;

        if (i < str.length() && str.charAt(i) == '-') {
            isNegative = true;
            i += 1;
        }

        if (i < str.length() && str.charAt(i) == '+' && !isNegative) i += 1;

        while (i < str.length()) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9' && x <= MAX_VALUE) {
                x = x * 10 + (c - '0');
            } else break;
            i += 1;
        }
        if (isNegative) {
            x = -x;
            if (x < MIN_VALUE) return MIN_VALUE;
        }
        if (x > MAX_VALUE) return MAX_VALUE;

        return (int) x;
    }

}
