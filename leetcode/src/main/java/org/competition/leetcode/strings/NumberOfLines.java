package org.competition.leetcode.strings;

public class NumberOfLines {
    public int[] numberOfLines(int[] widths, String s) {
        int [] result = {-1, -1};
        int lines = 1;
        int pixels = 0;
        for(int index = 0;index<s.length();index++) {
            int width = widths[s.charAt(index) - 'a'];
            pixels += width;
            if(pixels > 100) {
                pixels = width;
                lines++;
            }
        }
        result[0] = lines;
        result[1] = pixels;
        return result;
    }
}
