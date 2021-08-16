package org.competition.leetcode.array;


import java.util.ArrayList;
import java.util.List;

public class Page {

    public int[] pagination(int[] ints, int pageSize, int page) {
        if (ints.length > pageSize) { // do only if the number of elements supplied is greater than page Size
            int start = (page - 1) * pageSize;
            int end = start + pageSize > ints.length - 1 ? ints.length - 1 : start + pageSize;
            int[] rInts = new int[pageSize];
            int counter = 0;
            for (int i = start; i < end; i++) {
                rInts[counter++] = ints[i];
            }
            return rInts;
        }
        return ints;
    }

    public List<Integer> pagination(List<Integer> integerList, int pageSize, int page) {
        if (integerList.size() > pageSize) { // do only if the number of elements supplied is greater than page Size
            int start = (page - 1) * pageSize;
            int end = start + pageSize > integerList.size() - 1 ? integerList.size() - 1 : start + pageSize;
            return integerList.subList(start, end);
        }
        return integerList;
    }
}
