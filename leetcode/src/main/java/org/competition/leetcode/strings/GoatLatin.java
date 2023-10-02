package org.competition.leetcode.strings;

public class GoatLatin {

    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int index=1;
        for(String word : words) {
            if(isVowel(word.charAt(0))) {
                sb.append(word).append("ma");
            } else {
                sb.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            sb.append("a".repeat(index));
            index++;
            if(index <= words.length) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
