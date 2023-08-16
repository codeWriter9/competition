package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateStringTest {

    private RotateString rotateString;

    @Before
    public void setUp() throws Exception {
        rotateString = new RotateString();
    }

    @Test
    public void testRotateString() {
        assertNotNull(rotateString);
        assertTrue(rotateString.rotateString("abcde", "cdeab"));
        assertFalse(rotateString.rotateString("abcde", "abced"));
    }

    @After
    public void tearDown()  {
        rotateString = null;
    }
}
