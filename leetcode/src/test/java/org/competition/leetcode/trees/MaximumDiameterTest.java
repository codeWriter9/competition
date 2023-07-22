package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MaximumDiameterTest {

    private MaximumDiameter maximumDiameter;

    @Before
    public void setUp() throws Exception {
        maximumDiameter = new MaximumDiameter();
    }

    @Test
    public void testMaximumDiameter() throws Exception {
        assertNotNull(maximumDiameter);
        assertEquals(3, maximumDiameter.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3))));
        assertEquals(1, maximumDiameter.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2), null)));
    }

    @After
    public void destroy() throws Exception {
        maximumDiameter = null;
    }
}
