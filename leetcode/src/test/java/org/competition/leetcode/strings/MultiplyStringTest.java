package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 *
 *
 *
 *
 */
public class MultiplyStringTest {

    private MultiplyString multiplyString;

    @Before
    public void setUp() throws Exception {
        multiplyString = new MultiplyString();
    }

    @Test
    public void testMultiply() {
        assertNotNull(multiplyString);
        assertEquals("6", multiplyString.multiply("2", "3"));
        assertEquals("56088", multiplyString.multiply("123", "456"));
        assertEquals("300", multiplyString.multiply("3", "100"));
        assertEquals("10000", multiplyString.multiply("5", "2000"));
        assertEquals("10000", multiplyString.multiply("2000", "5"));
    }

    @After
    public void destroy() throws Exception {
        multiplyString = null;
    }
}
