package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class MergeSortTest {

    private MergeSort mergeSort;

    @Before
    public void before() {
        mergeSort = new MergeSort();
    }

    @Test
    public void testMerge() {
        assertNotNull(mergeSort);
        int[] original = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] copy = new int[original.length];
        mergeSort.merge(original, 0, 5, original.length, copy);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, copy);
    }


    @Test
    public void testMerge2() {
        assertNotNull(mergeSort);
        int[] original = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] copy = new int[original.length];
        mergeSort.merge(original, 0, 5, original.length, copy);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, copy);
    }

    @Test
    public void testMergeSort() {
        int[] original = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        mergeSort.sortArray(original);
        System.out.println(Arrays.toString(original));
    }

    @Test
    public void testMergeSort2() {
        int[] original = {5, 2, 3, 1};
        mergeSort.sortArray(original);
        System.out.println(Arrays.toString(original));
    }

    @After
    public void after() {
        mergeSort = null;
    }

}
