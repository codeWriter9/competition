package org.competition.leetcode.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 *
 *
 *
 * TODO: complete this
 *
 *
 */
public class MultiplyString {

    private int a = 0;
    private int b = 1;
    private int c = 2;

    public String multiply(String num1, String num2) {
        return "";
    }

    int[] convertToIntegerArray(String num) {
        int[] result = new int[num.length()];
        for(int i = 0; i < num.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return result;
    }

    String convertToString(int [] num) {
        StringBuilder builder = new StringBuilder("");
        for(int i = 0; i < num.length; i++) {
            builder.append(num[i]);
        }
        return builder.toString();
    }

    List<Integer> multiply(int [] nums, int multiplier) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            int product = nums[i] * multiplier + carry;
            result.add(product % 10);
            carry = product / 10;
        }
        if(carry > 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result;
    }


}