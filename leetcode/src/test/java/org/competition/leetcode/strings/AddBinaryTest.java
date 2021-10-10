package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AddBinaryTest {

    private AddBinary addBinary;

    @Before
    public void before() {
        addBinary = new AddBinary();
    }

    @Test
    public void testAddBinary() {
        assertNotNull(addBinary);
        assertEquals("100", addBinary.addBinary("11", "1"));
    }

    @Test
    public void testAddBinary2() {
        assertNotNull(addBinary);
        assertEquals("100", addBinary.addBinary("1", "11"));
    }

    @Test
    public void testAddBinary3() {
        assertNotNull(addBinary);
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }

    @Test
    public void testAddBinary4() {
        assertNotNull(addBinary);
        assertEquals("1001001", addBinary.addBinary("110010", "10111"));
    }

    @After
    public void after() {
        addBinary = null;
    }
}