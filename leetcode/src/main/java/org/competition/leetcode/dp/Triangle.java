package org.competition.leetcode.dp;

import java.util.List;

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 1) return triangle.get(0).get(0); // if single row return top element
        int minTotal = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<triangle.size();i++) {
            sum = sum + triangle.get(i).get(i);
        }
        return minTotal;
    }

}
