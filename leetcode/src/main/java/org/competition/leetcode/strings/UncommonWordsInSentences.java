package org.competition.leetcode.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UncommonWordsInSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");
        for(String s1Word : s1Array) {
            if(map.containsKey(s1Word)) {
                map.put(s1Word, -1);
            } else {
                map.put(s1Word, 1);
            }
        }
        for(String s2Word : s2Array) {
            if(map.containsKey(s2Word)) {
                map.put(s2Word, -1);
            } else {
                map.put(s2Word, 1);
            }
        }
        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).toArray(String[]::new);
    }
}
