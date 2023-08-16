package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Palindrome2Test {

    private Palindrome2 palindrome2;

    @Before
    public void setUp() {
        palindrome2 = new Palindrome2();
    }

    @Test
    public void testValidPalindrome() {
        assertTrue(palindrome2.validPalindrome("aba"));
        assertTrue(palindrome2.validPalindrome("abca"));
        assertFalse(palindrome2.validPalindrome("abc"));
        assertFalse(palindrome2.validPalindrome("tebbem"));
        assertTrue(palindrome2.validPalindrome("aguokepat" +
                "gbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjx" +
                "qncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtap" +
                "ekouga"));
    }

    @After
    public void destroy() {
        palindrome2 = null;
    }
}
