package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LongestSubstringTest {

    private LongestSubstring longestSubstring;

    @Before
    public void before() {
        longestSubstring = new LongestSubstring();
    }

    @Test
    public void testLongestSubstring() {
        assertNotNull(longestSubstring);
    }

    @Test
    public void testLongestSubstringEmpty() {
        assertEquals(0, longestSubstring.lengthOfLongestSubstring(""));
    }

    @Test
    public void testLongestSubstringSingle() {
        assertEquals(1, longestSubstring.lengthOfLongestSubstring(" "));
    }

    @Test
    public void testLongestSubstringDouble() {
        assertEquals(2, longestSubstring.lengthOfLongestSubstring("au"));
    }

    @Test
    public void testLongestSubstringSingleCharRepeat() {
        assertEquals(1, longestSubstring.lengthOfLongestSubstring("bbbbbb"));
    }

    @After
    public void after() {
        longestSubstring = null;
    }

}