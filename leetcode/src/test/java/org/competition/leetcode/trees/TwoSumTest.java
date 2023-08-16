package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testTwoSum() {
        assertNotNull(twoSum);
        assertTrue(twoSum.findTarget(new TreeNode(5, new TreeNode(3, new TreeNode(2)
                , new TreeNode(4)), new TreeNode(6, null, new TreeNode(7))), 9));
        assertFalse(twoSum.findTarget(new TreeNode(5, new TreeNode(3, new TreeNode(2)
                , new TreeNode(4)), new TreeNode(6, null, new TreeNode(7))), 28));
    }

    @After
    public void tearDown() {
        twoSum = null;
    }
}
