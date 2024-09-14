package org.competition.leetcode.stack;

import java.util.Stack;

public class SumSubArrayRanges {


    public long subArrayRanges1(int[] nums) {
        long sum = 0L;
        for (int i = 0; i < nums.length; i++) {
            long min = nums[i];
            long max = nums[i];
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                sum += max - min;
            }
        }
        return sum;
    }

    public long subArrayRanges2(int[] arr) {
        long sum = 0L;
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(-1);
        for (int i = 0; i < arr.length + 1; i++) {
            int current = (i < arr.length) ? arr[i] : Integer.MIN_VALUE;
            while (stack.peek() != -1 && current > arr[stack.peek()]) {
                int index = stack.pop();
                int i1 = stack.peek();
                int left = index - i1;
                int right = i - index;
                //System.out.println(" left " + left + " right " + right + " arr[ " + index + "]  = " + arr[index]);
                long substract = (long) (left * right * (long) arr[index]);
                //System.out.println(" substract " + substract + " sum " + sum);
                sum = sum - substract;
            }
            stack.push(i);
        }

        stack.clear();

        stack.push(-1);
        for (int i = 0; i < arr.length + 1; i++) {
            int current = (i < arr.length) ? arr[i] : Integer.MAX_VALUE;
            while (stack.peek() != -1 && current < arr[stack.peek()]) {
                int index = stack.pop();
                int i1 = stack.peek();
                int left = index - i1;
                int right = i - index;
                //System.out.println(" left " + left + " right " + right + " arr[ " + index + "]  = " + arr[index]);
                long add = (long) (left * right * (long) arr[index]);
                //System.out.println(" add " + add + " sum " + sum);
                sum = sum + add;
            }
            stack.push(i);
        }

        return (int) sum;
    }


    public long subArrayRanges(int[] A) {
        int n = A.length, current, left;
        long res = 0;

        Stack<Integer> s = new Stack<>();
        for (int right = 0; right <= n; right++) {
            if (right < n) {
                //System.out.println(" right " + right + " A [ " + right + "] " + A[right] + " stack " + s + " A " + java.util.Arrays.toString(A));
            } else {
                //System.out.println(" right " + right + " stack " + s + " A " + java.util.Arrays.toString(A));
            }
            while (!s.isEmpty() && A[s.peek()] > (right == n ? Integer.MIN_VALUE : A[right])) {
                current = s.pop();
                left = s.isEmpty() ? -1 : s.peek();
                //System.out.println(" current " + current + " current A[" + current + "] " + A[current] + " left " + left + " right " + right);
                long substract = (long) A[current] * (right - current) * (current - left);
                //System.out.println(" substract " + substract + " res " + res);
                res -= substract;

            }
            s.push(right);
        }
        //System.out.println(" res " + res);
        s.clear();
        for (int right = 0; right <= n; right++) {
            if (right < n) {
                //System.out.println(" right " + right + " A [ " + right + "] " + A[right] + " stack " + s + " A " + java.util.Arrays.toString(A));
            } else {
                //System.out.println(" right " + right + " stack " + s + " A " + java.util.Arrays.toString(A));
            }
            while (!s.isEmpty() && A[s.peek()] < (right == n ? Integer.MAX_VALUE : A[right])) {
                current = s.pop();
                left = s.isEmpty() ? -1 : s.peek();
                //System.out.println(" current " + current + " current A[" + current + "] " + A[current] + " left " + left + " right " + right);
                long add = (long) A[current] * (right - current) * (current - left);
                //System.out.println(" add " + add + " res " + res);
                res += add;

            }
            s.push(right);
        }
        //System.out.println(" res " + res);
        return res;
    }

}
