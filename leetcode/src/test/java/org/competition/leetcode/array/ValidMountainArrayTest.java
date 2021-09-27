package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidMountainArrayTest {

    public ValidMountainArray validMountainArray;

    @Before
    public void before() {
        validMountainArray = new ValidMountainArray();
    }

    @Test
    public void testValidMountainArray() {
        assertNotNull(validMountainArray);
        assertFalse(validMountainArray.validMountainArray(new int[]{1, 2}));
        assertFalse(validMountainArray.validMountainArray(new int[]{1}));
        assertFalse(validMountainArray.validMountainArray(new int[]{3, 5, 5}));
        assertFalse(validMountainArray.validMountainArray(new int[]{0, 2, 3, 3, 5, 2, 1, 0}));
        assertFalse(validMountainArray.validMountainArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertFalse(validMountainArray.validMountainArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
        assertTrue(validMountainArray.validMountainArray(new int[]{0, 3, 2, 1}));
        assertTrue(validMountainArray.validMountainArray(new int[]{0, 2, 3, 4, 5, 2, 1, 0}));
    }

    @After
    public void after() {
        validMountainArray = null;
    }
}