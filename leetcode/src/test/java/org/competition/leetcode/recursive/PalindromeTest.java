package org.competition.leetcode.recursive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class PalindromeTest extends TestCase {

    private Palindrome palindrome;

    public PalindromeTest(String name) {
        super(name);
        palindrome = new Palindrome();
    }

    public static Test suite() {
        return new TestSuite(PalindromeTest.class);
    }

    public void testPalindrome() {
        Assert.assertNotNull(palindrome);
        Assert.assertEquals(true, palindrome.palindrome("malayalam"));
        Assert.assertEquals(false, palindrome.palindrome("NotAPalindrome"));

    }
}