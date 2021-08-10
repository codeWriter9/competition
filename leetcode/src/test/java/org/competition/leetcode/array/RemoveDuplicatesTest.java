package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class RemoveDuplicatesTest extends TestCase {

    private RemoveDuplicates removeDuplicates;

    public RemoveDuplicatesTest(String testName) {
        super(testName);
        removeDuplicates = new RemoveDuplicates();
    }

    public static Test suite() {
        return new TestSuite(RemoveDuplicatesTest.class);
    }

    public void testRemovesDuplicatesTest0() {
        assertNotNull(removeDuplicates);
        int[] nums = new int[]{}; // Input array
        int[] expectedNums = new int[]{}; // The expected answer with correct length

        int k = removeDuplicates.removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }


    public void testRemovesDuplicatesTest() {
        assertNotNull(removeDuplicates);
        int[] nums = new int[]{1, 1, 2}; // Input array
        int[] expectedNums = new int[]{1, 2}; // The expected answer with correct length

        int k = removeDuplicates.removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public void testRemovesDuplicatesTest1() {
        assertNotNull(removeDuplicates);
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        int[] expectedNums = new int[]{0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = removeDuplicates.removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
