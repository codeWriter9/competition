package org.competition.leetcode.strings;

/**
 *
 */
public class MultiplyString {


    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        // Long Multiplication
        for (int i = n1 - 1; i > -1; i--) {
            int m1 = (arr1[i] - '0');// can be re-used for next loop
            for (int j = n2 - 1; j > -1; j--) {
                result[i + j + 1] +=  m1 * (arr2[j] - '0');
            }
        }

        // Addition
        for(int i = result.length - 1, carryOver = 0, sum = 0; i > -1; i--) {
            sum = result[i] + carryOver;
            carryOver = sum / 10;
            result[i] = sum % 10 + '0';// step sum % 10 places after '0'
        }

        int offset = result[0] == '0' ? 1 : 0;
        return new String(result, offset, result.length - offset);
    }


}