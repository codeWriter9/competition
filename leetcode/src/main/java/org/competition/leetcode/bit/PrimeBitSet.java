package org.competition.leetcode.bit;

import java.util.ArrayList;
import java.util.List;

public class PrimeBitSet {

    private List<Integer> primes = new ArrayList<Integer>();

    public PrimeBitSet() {
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
        primes.add(19);
        primes.add(23);
        primes.add(29);
        primes.add(31);
    }

    public int countPrimeSetBits(int left, int right) {
        int sum = 0;
        for(int index=left;index<=right; index++) if(primes.contains(Integer.bitCount(index))) sum++;
        return sum;
    }
}
