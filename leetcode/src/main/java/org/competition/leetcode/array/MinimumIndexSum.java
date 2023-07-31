package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class MinimumIndexSum {

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        for(int sum=0;sum<list1.length + list2.length - 1;sum++) {// for all sums from 0 to list1.length + list2.length - 1
            for(int index=0;index<=sum;index++) {// for all indices from 0 to sum
                if(index < list1.length && sum - index < list2.length && list1[index].equals(list2[sum - index]))
                    result.add(list1[index]);// add this string to result
            }
            if(result.size() > 0) break;// break as soon as we have a match. Further matches will have higher sum.
        }
        return result.toArray(new String[0]);
    }
}
