package org.competition.leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<Integer> getRow(int n) {
        List<Integer> row = new ArrayList<>();
        row.add(1);//https://en.wikipedia.org/wiki/Pascal's_triangle#Formula
        for (int k = 1; k <= n; k++) {
            row.add((int) ((row.get(row.size() - 1) * (long) (n - k + 1)) / k));
        }
        return row;
    }
}
