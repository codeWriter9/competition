package org.competition.leetcode.slidingwindow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SubstrDistinctCharTest {

    private SubstrDistinctChar substrDistinctChar;

    @Before
    public void setUp() throws Exception {
        substrDistinctChar = new SubstrDistinctChar();
    }

    @Test
    public void testSubstrDistinctChar() {
        assertNotNull(substrDistinctChar);
        assertEquals(1, substrDistinctChar.countGoodSubstrings("xyzzaz"));
        assertEquals(4, substrDistinctChar.countGoodSubstrings("aababcabc"));

    }

    @After
    public void tearDown() throws Exception {
        substrDistinctChar = null;
    }
}
