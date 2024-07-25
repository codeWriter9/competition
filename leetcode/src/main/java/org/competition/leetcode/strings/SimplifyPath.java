package org.competition.leetcode.strings;

import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        for(String p : paths) {
            if(p.equals("..")) {
                if(!stack.isEmpty()) { // only if stack is not empty
                    stack.pop();// pop up a path to go up a level
                }
            } else if(!p.equals(".") && !p.isEmpty()) { // ignore "." and empty string
                stack.push(p);// . means this directory only
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : stack) {
            sb.append("/").append(s);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }
}
