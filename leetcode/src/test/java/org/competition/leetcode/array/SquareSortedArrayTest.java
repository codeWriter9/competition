package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class SquareSortedArrayTest {

    private SquareSortedArray squareSortedArray;

    @Before
    public void before() {
        squareSortedArray = new SquareSortedArray();
    }

    @Test
    public void testSquareSortedArray() {
        assertNotNull(squareSortedArray);
        int[] array = {-4, -1, 0, 3, 10};
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, squareSortedArray.squareSortedArray(array));
    }

    @Test
    public void testSquareSortedArray2() {
        assertNotNull(squareSortedArray);
        int[] array = {-7, -3, 2, 3, 11};
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, squareSortedArray.squareSortedArray(array));
    }

    @Test
    public void testSquareSortedArray3() {
        assertNotNull(squareSortedArray);
        int[] array = {-5, -3, -2, -1};
        assertArrayEquals(new int[]{1, 4, 9, 25}, squareSortedArray.squareSortedArray(array));
    }

    @Test
    public void testSquareSortedArray4() {
        assertNotNull(squareSortedArray);
        int[] array = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, squareSortedArray.squareSortedArray(array));
    }

    @After
    public void after() {
        squareSortedArray = null;
    }
}