package org.competition.leetcode.math;

public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        int counter = 2;
        int upperBound = (int) Math.sqrt(num);
        while (counter <= upperBound) {
            if (num % counter == 0) {
                sum += counter;
                sum += num / counter;
            }
            counter++;
            if (sum > num) return false;
        }
        return sum == num;
    }
}
