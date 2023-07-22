package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MinimumDistanceTest {

    private MinimumDistance minimumDistance;

    @Before
    public void setUp() {
        minimumDistance = new MinimumDistance();
    }

    @Test
    public void testMinimumDistance() {
        assertNotNull(minimumDistance);
        assertEquals(0, minimumDistance.minDiffInBST(null));
        assertEquals(1, minimumDistance.minDiffInBST(TreeNode.node(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6))));
    }

    @After
    public void tearDown() {
        minimumDistance = null;
    }
}
