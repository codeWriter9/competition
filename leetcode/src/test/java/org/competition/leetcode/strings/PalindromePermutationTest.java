package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {

    private PalindromePermutation palindromePermutation;

    @Before
    public void setUp() {
        palindromePermutation = new PalindromePermutation();
    }

    @Test
    public void test() {
        assertNotNull(palindromePermutation);
        assertFalse(palindromePermutation.canPermutePalindrome("code"));
        assertTrue(palindromePermutation.canPermutePalindrome("aab"));
        assertTrue(palindromePermutation.canPermutePalindrome("carerac"));
    }

    @After
    public void tearDown() {
        palindromePermutation = null;
    }
}
