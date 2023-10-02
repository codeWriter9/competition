package org.competition.leetcode.strings;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder rb = new StringBuilder();
        for(char c : s.toCharArray()) {
            int chint = (int)c;
            int rint = 0;
            if(chint >=65 && chint <= 90) {
                sb.append(c);
                rb.append(c);
            }
            else if(chint >=97 && chint <= 122) {
                sb.append(c);
                rb.append(c);
            }
            else {
                sb.append(c);
            }
        }
        int index = 0;
        char [] rev = rb.reverse().toString().toCharArray();
        for(int i=0;i<sb.length();i++) {
            if(
                    (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
                            ||
                            (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
            ) {
                sb.setCharAt(i, rev[index++]);
            }
        }
        return sb.toString();
    }
}
