package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CountAndSayTest {

    private CountAndSay countAndSay;

    @Before
    public void before() {
        countAndSay = new CountAndSay();
    }

    @Test
    public void testCountAndSay() {
        assertNotNull(countAndSay);
        assertEquals("1", countAndSay.countAndSay(1));
        assertEquals("11", countAndSay.countAndSay(2));
        assertEquals("21", countAndSay.countAndSay(3));
        assertEquals("1211", countAndSay.countAndSay(4));
        assertEquals("111221", countAndSay.countAndSay(5));
        assertEquals("312211", countAndSay.countAndSay(6));
        assertEquals("13112221", countAndSay.countAndSay(7));
        assertEquals("1113213211", countAndSay.countAndSay(8));
        assertEquals("31131211131221", countAndSay.countAndSay(9));
        assertEquals("13211311123113112211", countAndSay.countAndSay(10));
    }

    @After
    public void after() {
        countAndSay = null;
    }

}