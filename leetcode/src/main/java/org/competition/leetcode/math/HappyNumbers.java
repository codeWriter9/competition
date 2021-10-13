package org.competition.leetcode.math;

import java.util.HashMap;
import java.util.Map;

public class HappyNumbers {

    private Map<Integer, Integer> squares = new HashMap<>();

    {
        squares.put(0, 0);
        squares.put(1, 1);
        squares.put(2, 4);
        squares.put(3, 9);
        squares.put(4, 16);
        squares.put(5, 25);
        squares.put(6, 36);
        squares.put(7, 49);
        squares.put(8, 64);
        squares.put(9, 81);
    }

    public boolean isHappy(int n) {
        int count = 0;
        while(n != 1) {
            n=sumOfSquareOfDigits(n);
            if(count > 10) return false;
            count++;
        }
        return true;
    }

    private int sumOfSquareOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum = sum + squares.get(n % 10);
            n = n / 10;
        }
        return sum;
    }

}