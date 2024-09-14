package org.competition.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MonotonicStack {

    public List<Integer> minStack(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            System.out.println("[1] arr[i] " + arr[i] + " stack " + stack);
            if(!stack.isEmpty() && stack.peek() > arr[i]) {
                System.out.println("[2] arr[i] " + arr[i] + " stack " + stack);
                while(!stack.isEmpty() && stack.peek() > arr[i]) {
                    System.out.println("[3] arr[i] " + arr[i] + " stack " + stack);
                    list.add(stack.pop());
                }
                stack.push(arr[i]);
            }
            else {
                System.out.println("[4] arr[i] " + arr[i] + " stack " + stack);
                stack.push(arr[i]);
            }
        }
        return list;
    }
}
