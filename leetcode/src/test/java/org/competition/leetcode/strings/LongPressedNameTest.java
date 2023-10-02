package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongPressedNameTest {

    private LongPressedName longPressedName;

    @Before
    public void setUp() throws Exception {
        longPressedName = new LongPressedName();
    }

    @Test
    public void testIsLongPressedName() {
        assertNotNull(longPressedName);
        assertTrue(longPressedName.isLongPressedName("alex", "aaleex"));
        assertFalse(longPressedName.isLongPressedName("saeed", "ssaaedd"));
    }

    @After
    public void tearDown() throws Exception {
        longPressedName = null;
    }
}
