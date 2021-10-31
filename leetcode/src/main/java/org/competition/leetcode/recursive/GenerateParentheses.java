package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if(n < 1) return list;
        generateParenthesis(n, n, new StringBuilder(), list);
        return list;
    }

    private void generateParenthesis(int open, int close, StringBuilder builder, List<String> list) {
        if(open == close && open == 0) {
            list.add(builder.toString());
            return;
        }
        if(open > 0) {// if there are more opening brackets
            builder.append("(");// Add opening brackets
            generateParenthesis(open - 1, close, builder, list);// Go to Next Iteration with changes parameters
            builder.setLength(builder.length() - 1);// Remove opening brackets
        }
        if(open < close && close > 0) {// if there are more closing brackets and they are more than open
            builder.append(")");// Add closing brackets
            generateParenthesis(open, close - 1, builder, list);// Go to Next Iteration with changes parameters
            builder.setLength(builder.length() - 1);// Remove closing brackets
        }
    }
}