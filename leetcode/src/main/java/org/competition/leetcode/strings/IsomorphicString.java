package org.competition.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    Map<Character, Character> map = new HashMap<>();

    public boolean isIsomorphic(String s, String t) {
        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();
        for(int index = 0;index<s.length();index++) {
            if(map.containsKey(sArray[index]) && map.get(sArray[index]) != tArray[index]) return false;
            else if(!map.containsKey(sArray[index]) && map.containsValue(tArray[index])) return false;
            else map.put(sArray[index], tArray[index]);
        }
        return true;
    }
}
