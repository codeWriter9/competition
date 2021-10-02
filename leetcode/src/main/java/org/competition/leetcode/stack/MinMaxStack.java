package org.competition.leetcode.stack;

import java.util.Stack;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MinMaxStack {

    private Stack<int[]> stack = new Stack<>();

    public void push(int val) {
        if (stack.empty()) {
            stack.push(new int[]{val, val, val});
        } else {
            stack.push(new int[]{val, min(val, stack.peek()[1]), max(val, stack.peek()[2])});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int getMax() {
        if(stack.isEmpty()) return -1;
        else return stack.peek()[2];
    }

    public int getMin() {
        if(stack.isEmpty()) return -1;
        else return stack.peek()[1];
    }

    public int top() {
        return stack.peek()[0];
    }
}
