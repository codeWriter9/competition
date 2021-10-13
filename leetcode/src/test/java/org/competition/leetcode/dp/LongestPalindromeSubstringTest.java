package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 * Not Optimal Solution
 *
 * TODO Find Optimal DP Solution
 */
public class LongestPalindromeSubstringTest {

    private LongestPalindromeSubstring longestPalindromeSubstring;

    @Before
    public void before() {
        longestPalindromeSubstring = new LongestPalindromeSubstring();
    }

    @Test
    public void testLongestPalindrome() {
        assertNotNull(longestPalindromeSubstring);
        assertEquals("a", longestPalindromeSubstring.longestPalindrome("a"));
        assertEquals("bab", longestPalindromeSubstring.longestPalindrome("babad"));
        assertEquals("bb", longestPalindromeSubstring.longestPalindrome("cbbd"));
        assertEquals("a", longestPalindromeSubstring.longestPalindrome("ac"));
    }

    @After
    public void after() {
        longestPalindromeSubstring = null;
    }
}