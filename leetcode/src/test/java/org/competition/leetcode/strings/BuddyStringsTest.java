package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyStringsTest {

    private BuddyStrings buddyStrings;

    @Before
    public void setUp() throws Exception {
        buddyStrings = new BuddyStrings();
    }

    @Test
    public void testBuddyStrings() {
        assertNotNull(buddyStrings);
        assertTrue(buddyStrings.buddyStrings("ab", "ba"));
        assertFalse(buddyStrings.buddyStrings("ab", "ab"));
        assertTrue(buddyStrings.buddyStrings("aa", "aa"));
    }

    @After
    public void tearDown() throws Exception {
        buddyStrings = null;
    }
}
