package org.competition.leetcode.math;

public class Base7 {

    int [] powers = new int[9];

    {
        powers[0] = 1;
        for(int index=1;index<powers.length;index++) {
            powers[index] = powers[index - 1] * 7;
        }
    }

    public String convertToBase7(int num) {
        boolean isNegative = false;
        if(num == 0) return "0";
        if(num < 0) {
            isNegative = true;
            num = num * -1;
        }
        int index = 8;
        while(powers[index] > num) index--;
        StringBuilder sb = new StringBuilder("");
        while(index > -1) {
            if(powers[index] <= num) {
                int count =0;
                while(powers[index] <= num) {
                    num = num - powers[index];
                    count++;
                }
                sb.append(count);
            }
            else {
                sb.append("0");
            }
            index--;
        }
        return !isNegative ? sb.toString() : sb.insert(0, "-").toString();
    }
}
