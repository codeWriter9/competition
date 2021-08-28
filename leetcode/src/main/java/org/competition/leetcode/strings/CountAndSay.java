package org.competition.leetcode.strings;


public class CountAndSay {


    public String countAndSay(int n) {
        if (n == 1) return "1";
        else {
            String say = countAndSay(n - 1);
            StringBuilder builder = new StringBuilder();
            int i = 0;
            while (i < say.toCharArray().length) {
                if (say.charAt(i) >= '0' || say.charAt(i) <= '9') {
                    char c = say.charAt(i);
                    int count =0;
                    while (i < say.length() && say.charAt(i) == c) {
                        i++;
                        count++;
                    }
                    builder.append(count + "" + c);
                }
            }
            return builder.toString();
        }
    }

}
