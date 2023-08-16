package org.competition.leetcode.array;

public class Palindrome2 {

    private boolean checkPalindrome(String s, int fwdPtr, int bckPtr) {
        while (fwdPtr < bckPtr) {
            if (s.charAt(fwdPtr) != s.charAt(bckPtr)) {
                return false;
            }
            fwdPtr++;
            bckPtr--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int fwdPtr = 0;
        int bckPtr = s.length() - 1;
        while (fwdPtr < bckPtr) {
            // Found a mismatched pair - try both deletions
            if (s.charAt(fwdPtr) != s.charAt(bckPtr)) {
                return (checkPalindrome(s, fwdPtr, bckPtr - 1) || checkPalindrome(s, fwdPtr + 1, bckPtr));
            }
            fwdPtr++;
            bckPtr--;
        }

        return true;
    }
}
