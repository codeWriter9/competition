package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.List;


public class DuplicateZero {

    public void duplicateZeros(int[] arr) {
        int numberOfZeroes = 0;
        for(int n : arr) {
            if(n == 0) numberOfZeroes++;
        }
        if(numberOfZeroes == 0) return;
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            if(a != 0) list.add(a);
            else {
                list.add(0);
                list.add(0);
            }
        }
        for(int i = arr.length -1;i>=0;i--) arr[i] = list.get(i);
    }

}
