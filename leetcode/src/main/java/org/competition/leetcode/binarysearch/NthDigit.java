package org.competition.leetcode.binarysearch;

public class NthDigit {

    /**
     *
     * We search in these ranges
     * [1-9] - length of number is 1 - total 9 numbers
     * [10-99] - length of number is 2 - total 9 * 10 numbers
     * [100-999] - length of number is 3 - total 9 * 100 numbers
     *
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        long low = 1;// range start
        long high = 9;// range end
        long numberOfDigits = 1;// count of digit in number
        while(n > high * numberOfDigits) { // till n is greater than end of range
            n -= high * numberOfDigits;
            numberOfDigits = numberOfDigits + 1;
            low *= 10;// go to the next range
            high *= 10;// do
        }
        System.out.println(" low " + low);
        System.out.println(" n " + n);
        long num = low + (n - 1) / numberOfDigits;
        System.out.println(" num " + num);
        return Long.toString(num).charAt((int)((n - 1) % numberOfDigits)) - '0';
    }
}
