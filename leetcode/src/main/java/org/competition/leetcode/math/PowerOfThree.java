package org.competition.leetcode.math;

public class PowerOfThree {

    public boolean isPowerOfThree(int i) {
        if(i > 1 && (Integer.MAX_VALUE - 1) % i == 0) return true;
        else return false;
    }
}
