package org.competition.leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if(isSelfDividingNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isSelfDividingNumber(int i) {
        int n = i;
        while(n > 0) {
            int d = n % 10;
            if(d == 0 || i % d != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
