package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddStringTest {

    private AddString addString = new AddString();

    @Before
    public void setUp() {
        addString = new AddString();
    }

    @Test
    public void testAddStrings() {
        assertEquals("134", addString.addStrings("11", "123"));
        assertEquals("533", addString.addStrings("456", "77"));
        assertEquals("0", addString.addStrings("0", "0"));
        assertEquals("132", addString.addStrings("9", "123"));
        assertEquals("175", addString.addStrings("165", "10"));
        assertEquals("5555", addString.addStrings("2222", "3333"));
    }

    @After
    public void tearDown() {
        addString = null;
    }


}
