package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PascalTriangle {

    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return asList(1);
        if(rowIndex == 1) return asList(1, 1);
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(asList(1));
        triangle.add(asList(1, 1));
        return getRow(triangle, rowIndex);
    }

    private List<Integer> getRow(List<List<Integer>> triangle, int rowIndex) {
        if(rowIndex < triangle.size()) return triangle.get(rowIndex);
        else {
            List<Integer> lastRow = rowIndex - 1 < triangle.size() ? triangle.get(rowIndex - 1) : getRow(triangle, rowIndex - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int index=0;index + 1<lastRow.size();index++) {
                currentRow.add(lastRow.get(index) + lastRow.get(index + 1));
            }
            currentRow.add(1);
            return currentRow;
        }
    }
}