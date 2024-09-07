package org.competition.leetcode.stack;

import java.util.Stack;

public class SumOfSubArrayMin {

    public int sumSubarrayMins(int[] arr) {
        long sum = 0L;
        Stack<Integer> stack = new Stack<Integer>();
        long modulus = 1000_000_000L + 7L;
        stack.push(-1);
        for(int i=0;i<arr.length + 1;i++) {
            int current = (i < arr.length) ? arr[i] : 0;
            if(stack.peek() == -1) {
                System.out.println(" i " + i + " stack = " + stack + " current " + current + " stack peek " + (stack.peek()));
            }
            else {
                System.out.println(" i " + i + " stack = " + stack + " current " + current + " arr[ "
                        + (stack.peek()) + "] = "  + arr[stack.peek()]);
            }
            while(stack.peek() != -1 && current < arr[stack.peek()]) {
                int index = stack.pop();
                int i1 = stack.peek();
                int left = index - i1;
                int right = i - index;
                System.out.println(" left " + left + " right " + right + " arr[ " + index + "]  = " + arr[index]);
                long add = (long) (left * right * (long)arr[index]) % modulus;
                sum = (add + sum) % modulus;
                System.out.println(" add " + add + " sum " + sum);
            }
            stack.push(i);
        }
        return (int)sum;
    }
}
