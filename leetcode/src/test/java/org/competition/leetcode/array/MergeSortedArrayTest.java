package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class MergeSortedArrayTest {

    private MergeSortedArray mergeSortedArray;

    @Before
    public void before() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void testMergeSortedArray1() {
        assertNotNull(mergeSortedArray);
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, mergeSortedArray.merge(nums1, 3, nums2, 3));
    }

    @Test
    public void testMergeSortedArray2() {
        assertNotNull(mergeSortedArray);
        int[] nums1 = {1};
        int[] nums2 = {};
        assertArrayEquals(new int[]{1}, mergeSortedArray.merge(nums1, 1, nums2, 0));
    }

    @Test
    public void testMergeSortedArray3() {
        assertNotNull(mergeSortedArray);
        int[] nums1 = {0};
        int[] nums2 = {1};
        assertArrayEquals(new int[]{1}, mergeSortedArray.merge(nums1, 0, nums2, 1));
    }

    @Test
    public void test() {

    }

    @After
    public void after() {
        mergeSortedArray = null;
    }

}
