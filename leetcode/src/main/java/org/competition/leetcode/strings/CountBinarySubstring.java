package org.competition.leetcode.strings;

public class CountBinarySubstring {
    public int countBinarySubstrings(String s) {
        int current = 1;// will have atleast one character
        int previous = 0;
        int answer = 0;
        for (int index = 1; index < s.length(); index++) { // for entire string
            if (s.charAt(index) == s.charAt(index - 1)) { //check if the previous and current is same
                current++;// increment the current count
            } else { // if not same
                answer = answer + Math.min(previous, current); // check boundary condition and add previous group count
                previous = current;// save the current count
                current = 1;// reset the current count to 1 (remember we have 'jumped' the boundary)
            }
        }
        return answer + Math.min(previous, current);
    }
}