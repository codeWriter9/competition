package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class DuplicateZeroTest {

    private DuplicateZero duplicateZero;

    @Before
    public void before() {
        duplicateZero = new DuplicateZero();
    }

    @Test
    public void testDuplicateZero() {
        assertNotNull(duplicateZero);
        int[] array = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZero.duplicateZeros(array);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, array);
    }

    @Test
    public void testDuplicateZero2() {
        assertNotNull(duplicateZero);
        int[] array = {1, 2, 3};
        duplicateZero.duplicateZeros(array);
        assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @After
    public void after() {
        duplicateZero = null;
    }

}