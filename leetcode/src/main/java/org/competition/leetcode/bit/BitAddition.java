package org.competition.leetcode.bit;

public class BitAddition {

    public int add(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    public int or(int... args) {
        int sum = 0;
        for (int i : args) {
            sum |= i;
        }
        return sum;
    }

    public int sumOfBits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += (n & 1);
            n >>= 1;
        }
        return sum;
    }
}
