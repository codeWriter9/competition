package org.competition.leetcode.recursive;

public class SumOfDigits {

    public int sumOfDigits(int i) {
        if(i < 10) return i;
        else return i % 10 + sumOfDigits(i / 10);
    }
}
