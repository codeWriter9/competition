package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class RotateArrayTest extends TestCase {

    private RotateArray rotateArray;

    public RotateArrayTest(String testName) {
        super(testName);
        rotateArray = new RotateArray();
    }

    public static Test suite() {
        return new TestSuite(RotateArrayTest.class);
    }

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

}
