package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CountBinarySubstringTest {

    private CountBinarySubstring countBinarySubstring;

    @Before
    public void setUp()  {
        countBinarySubstring = new CountBinarySubstring();
    }

    @Test
    public void testCountBinarySubstrings() {
        assertNotNull(countBinarySubstring);
        assertEquals(6, countBinarySubstring.countBinarySubstrings("00110011"));
        assertEquals(4, countBinarySubstring.countBinarySubstrings("10101"));
    }

    @After
    public void destroy() {
        countBinarySubstring = null;
    }
}
