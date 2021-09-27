package org.competition.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        char opening1stBracket = '(';
        char closing1stBracket = ')';
        char opening2ndBracket = '{';
        char closing2ndBracket = '}';
        char opening3rdBracket = '[';
        char closing3rdBracket = ']';
        Map<Character, Character> matches = new HashMap<>();
        matches.put(closing1stBracket, opening1stBracket);
        matches.put(closing2ndBracket, opening2ndBracket);
        matches.put(closing3rdBracket, opening3rdBracket);
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == opening1stBracket || c == opening2ndBracket || c == opening3rdBracket) {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false; // if without an opening bracket there is a closing bracket
                Character last = stack.pop();
                if(!matches.get(c).equals(last)) return false;
            }
        }
        return stack.empty();
    }
}