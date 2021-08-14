package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class ContainsDuplicateTest extends TestCase {

    private ContainsDuplicate containsDuplicate;

    public ContainsDuplicateTest(String testName) {
        super(testName);
        containsDuplicate = new ContainsDuplicate();
    }

    public static Test suite() {
        return new TestSuite(ContainsDuplicateTest.class);
    }

    public void testContainsDuplicatesTest() {
        assertNotNull(containsDuplicate);
        int[] nums = new int[]{1, 1, 2}; // Input array
        Assert.assertTrue(containsDuplicate.containsDuplicate(nums));
    }

    public void testContainsDuplicatesTest2() {
        assertNotNull(containsDuplicate);
        int[] nums = new int[]{1, 2, 3}; // Input array
        Assert.assertFalse(containsDuplicate.containsDuplicate(nums));
    }

    public void testContainsDuplicatesTest3() {
        assertNotNull(containsDuplicate);
        int[] nums = new int[]{1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8, 9}; // Input array
        Assert.assertTrue(containsDuplicate.containsDuplicate(nums));
    }
}