package org.competition.leetcode.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MorseCodeTransform {

    private String [] morseCode = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
            "-.--","--.."};
    private Map<Character, String> morseCodeMap = new HashMap<>();

    {
        for(int i = 0; i < morseCode.length; i++) {
            morseCodeMap.put((char) (i + 97), morseCode[i]);
        }
    }

    public int uniqueMorseRepresentations(String[] words) {
        Set<Integer> set = new HashSet<>();
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()) {
                sb.append(morseCodeMap.get(c));
            }
            set.add(sb.toString().hashCode());
        }
        return set.size();
    }
}