package org.competition.leetcode.array;

public class DeleteColumnsSorted {

    public int minDeletionSize(String[] strs) {
        if (strs.length == 1) return 0;
        else {
            String s = strs[0];
            int numberOfColumns = 0;
            for (int column = 0; column < s.length(); column++) {
                for (int row = 0; row < strs.length - 1; row++) {
                    if (strs[row].charAt(column) > strs[row + 1].charAt(column)) {
                        numberOfColumns++;
                        break;
                    }
                }
            }
            return numberOfColumns;
        }
    }
}
