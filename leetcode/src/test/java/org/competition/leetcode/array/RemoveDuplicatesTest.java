package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates;

    @Before
    public void before() {
        removeDuplicates = new RemoveDuplicates();
    }


    @Test
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

    @Test
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

    @Test
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

    @After
    public void after() {
        removeDuplicates = null;
    }
}
