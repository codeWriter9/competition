package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringToIntegerTest {

    private StringToInteger stringToInteger;

    @Before
    public void before() {
        stringToInteger = new StringToInteger();
    }

    @Test
    public void testStringToInteger() {
        assertNotNull(stringToInteger);
        assertEquals(0, stringToInteger.myAtoi("words and 987"));
        assertEquals(42, stringToInteger.myAtoi("42"));
        assertEquals(-42, stringToInteger.myAtoi("   -42"));
        assertEquals(4193, stringToInteger.myAtoi("4193 with words"));
        assertEquals(-2147483648, stringToInteger.myAtoi("-91283472332"));
        assertEquals(2147483647, stringToInteger.myAtoi("91283472332"));
        assertEquals(3, stringToInteger.myAtoi("3.14159"));
        assertEquals(0, stringToInteger.myAtoi("+-12"));
    }

    @After
    public void after() {

    }

}