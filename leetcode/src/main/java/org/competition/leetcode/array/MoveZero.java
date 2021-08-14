package org.competition.leetcode.array;

public class MoveZero {
    public int[] moveZeroes(int[] ints) {
        int displaced = 0;
        // for every number in array
        for(int i=0;i<ints.length;i++) {
            if(ints[i]!=0) { // if the current number is not zero
                ints[displaced++] = ints[i];// then move displaced pointers and copy
            }
        }
        for(int i=displaced;i<ints.length;i++) { // from displaced values till end
            ints[i] = 0;   // fill the displaced number with zeroes
        }
        return ints;
    }
}
