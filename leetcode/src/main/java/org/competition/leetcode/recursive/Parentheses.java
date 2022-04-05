package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * TODO: Implementation Is not Correct
 *
 *
 *
 */
public class Parentheses {

    public String parentheses(int n) {
        StringBuilder builder = new StringBuilder();
        parentheses(n, builder);
        return builder.toString();
    }

    private void parentheses(int n, StringBuilder builder) {
        if(n == 0) {
            return;
        }
        builder.append("(");
        parentheses(n - 1, builder);
        builder.append(")");
    }

    public String parenthesis(int n) {
        StringBuilder builder = new StringBuilder();
        parenthesis(n, 0, builder, new ArrayList<>());
        return builder.toString();
    }

    private void parenthesis(int n, int i, StringBuilder builder, List<String> all) {
        if(i == n) {
            all.add(builder.toString());
            return;
        }
        for(int k = i;k<n;k++) {
            parenthesis(n, k + 1, builder, all);
            builder.append("(");
            parenthesis(n, k + 1, builder, all);
            builder.append(")");
        }
    }

}