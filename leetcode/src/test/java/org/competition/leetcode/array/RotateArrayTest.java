package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class RotateArrayTest {

    private RotateArray rotateArray;

    @Before
    public void before() {
        rotateArray = new RotateArray();
    }

    @Test
    public void testRotateArrayTest() {
        assertNotNull(rotateArray);
        int k = 2;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // Input array
        int[] expectedNums = new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7}; // The expected answer with correct length

        rotateArray.rotateArray(nums, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void testRotateArrayTest1() {
        assertNotNull(rotateArray);
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // Input array
        int[] expectedNums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // The expected answer with correct length
        int k = nums.length;

        rotateArray.rotateArray(nums, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void testRotateArrayInPlaceTest() {
        assertNotNull(rotateArray);
        int k = 2;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // Input array
        int[] expectedNums = new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7}; // The expected answer with correct length

        rotateArray.rotateArrayInPlace(nums, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void testRotateArrayInPlaceTest1() {
        assertNotNull(rotateArray);
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // Input array
        int[] expectedNums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // The expected answer with correct length
        int k = nums.length;

        rotateArray.rotateArrayInPlace(nums, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @After
    public void after() {
        rotateArray = null;
    }

}
