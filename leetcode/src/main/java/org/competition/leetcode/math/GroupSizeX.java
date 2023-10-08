package org.competition.leetcode.math;

import java.util.HashMap;
import java.util.Map;

public class GroupSizeX {

    private static int PROBLEM_SIZE = 10000;

    public boolean hasGroupsSizeX(int[] deck) {
        int[] frequency = new int[PROBLEM_SIZE];
        for (int index: deck) {
            frequency[index]++;
        }


        int g = -1;
        for (int i = 0; i < PROBLEM_SIZE; ++i)
            if (frequency[i] > 0) {
                if (g == -1) // if g is not initialized
                    g = frequency[i];
                else
                    g = gcd(g, frequency[i]);
            }

        return g >= 2;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}
