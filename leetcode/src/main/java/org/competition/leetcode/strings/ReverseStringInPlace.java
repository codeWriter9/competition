package org.competition.leetcode.strings;


public class ReverseStringInPlace {

    public String reverseString(String str) {
        if (str == null || "".equals(str)) return str;
        char[] array = str.toCharArray();
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return new String(array);
    }

    public String reverseStringInPlace(String str) {
        if (str == null || "".equals(str)) return str;
        char[] array = str.toCharArray();
        int left = 0;
        int right =array.length -1;
        while(left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return new String(array);
    }
}
