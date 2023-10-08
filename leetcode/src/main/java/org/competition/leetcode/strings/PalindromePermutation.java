package org.competition.leetcode.strings;

public class PalindromePermutation {

    public boolean canPermutePalindrome(String s) {
        boolean isEven = s.length() % 2 == 0;// is the palindrome even or odd length
        int odds = 0;// number of odd characters

        int [] buffer = new int[26];// frequency of each character
        char [] array = s.toCharArray();// convert string to char array
        for(int index=0;index<array.length;index++) {
            buffer[array[index] - 'a']++;// capture frequency of each character
        }
        for(int alphabet=0;alphabet<26;alphabet++) {
            if(buffer[alphabet] % 2 != 0) odds++;// count number of odd characters
        }
        return isEven ? odds == 0 : odds == 1;// if even length palindrome
        // then no odd characters else only one odd character
    }
}
