package org.competition.leetcode.recursive;

public class Factorial {
    public int factorial(int i) {
        if(i == 0 || i == 1) return 1;
        if(i > 10) throw new IllegalArgumentException("Cant handle only factorials upto 9");
        else return i * factorial(i - 1);
    }
}
