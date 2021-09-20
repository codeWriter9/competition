package org.competition.leetcode.array;

public class ReplaceElements {

    public int[] replaceElements(int[] array) {
        if (array.length == 1) return new int[]{-1};
        int max = array[array.length - 1];
        array[array.length - 1] = -1;
        for (int index = array.length - 2; index > -1; index--) {
            int temp = Math.max(max, array[index]);
            array[index] = max;
            max = temp;
        }
        return array;
    }
}
