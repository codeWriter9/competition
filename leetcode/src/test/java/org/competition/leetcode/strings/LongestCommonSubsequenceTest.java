package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence;

    @Before
    public void setUp() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }

    @Test
    public void testLongestCommonSubsequence() {
        assertNotNull(longestCommonSubsequence);
        assertEquals(0, longestCommonSubsequence.lcs("abc", "def"));
        assertEquals(3, longestCommonSubsequence.lcs("abcdef", "def"));
        assertEquals(3, longestCommonSubsequence.lcs("abc", "abcdef"));
        assertEquals(3, longestCommonSubsequence.lcs("ace", "abcdef"));
        assertEquals(2, longestCommonSubsequence.lcs("RTPCR", "BPGTR"));
        assertEquals(4, longestCommonSubsequence.lcs("pmjghexybyrgzczy", "hafcdqbgncrcbihkd"));
    }

    @After
    public void after() {
        longestCommonSubsequence = null;
    }
}