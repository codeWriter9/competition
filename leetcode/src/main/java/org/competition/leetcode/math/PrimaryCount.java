package org.competition.leetcode.math;

/**
 *
 * Count the number of Primes below the given number
 *
 *
 */
public class PrimaryCount {

    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] numbers = sieve(eros(n));

        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            if (!numbers[i]) {
                ++numberOfPrimes;
            }
        }

        return numberOfPrimes;
    }

    private boolean [] eros(int n) {
        return new boolean[n];
    }

    private boolean [] sieve(boolean [] eros) {
        for(int i=2;i<=(int)Math.sqrt(eros.length);i++) {
            if(!eros[i]) { // not yet accessed
                for(int j = i * i; j<eros.length;j = j + i ) {
                    eros[j] = true;
                }
            }
        }
        return eros;
    }

}
