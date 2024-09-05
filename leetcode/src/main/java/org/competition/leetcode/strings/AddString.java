package org.competition.leetcode.strings;

public class AddString {

    public String addStrings(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? arr1[i--] - '0' : 0;
            int n2 = j >= 0 ? arr2[j--] - '0' : 0;
            sb.append((n1 + n2 + carry) % 10);
            carry = (n1 + n2 + carry) / 10;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
