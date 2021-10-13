package org.competition.leetcode.math;

public class SquareRoot {

    public int mySqrt(int x) {
        if(x < 2) return x;
        int previous = 0;
        long longX = x;
        for(int candidate =0;candidate <= x/2;candidate++) {
            long longCandidate = candidate;
            long product = longCandidate * longCandidate;
            if(product == longX) return candidate;
            else if(product > longX) return previous;
            previous = candidate;
        }
        return previous;
    }
}
