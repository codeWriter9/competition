package org.competition.leetcode.recursive;

public class ReverseString {

    public String reverseString(String str) {
        if(str == null || str.length() == 0) return str;
        return reverse(str.toCharArray(), new StringBuilder(), str.length() - 1).toString();
    }

    private StringBuilder reverse(char [] array, StringBuilder builder, int index) {
        if(index < 0) return builder;
        return reverse(array, builder.append(array[index]), index - 1);
    }
}
