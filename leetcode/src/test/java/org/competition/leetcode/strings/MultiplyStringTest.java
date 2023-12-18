package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 *
 * TODO: complete this
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
        for (int index = 0; index < 10; index++) {
            assertArrayEquals(new int[]{index}, multiplyString.convertToIntegerArray(index + ""));
        }
        assertArrayEquals(new int[]{1, 0},
                multiplyString.convertToIntegerArray("10"));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                multiplyString.convertToIntegerArray("9876543210"));

        for (int index = 0; index < 10; index++) {
            assertEquals("" + index, multiplyString.convertToString(new int[]{index}));
        }

        assertEquals("10",
                multiplyString.convertToString(new int[]{1, 0}));
        assertEquals("9876543210",
                multiplyString.convertToString(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));

        assertEquals("[1, 1]", multiplyString.multiply(new int [] {1, 1}, 1).toString());
        assertEquals("[8, 9, 1]", multiplyString.multiply(new int [] {9, 9}, 9).toString());
        assertEquals("[5, 5, 7, 9]", multiplyString.multiply(new int [] {7, 9, 7}, 7).toString());


    }

    @After
    public void destroy() throws Exception {
        multiplyString = null;
    }
}
