package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlattenBinaryTreeTest {

    private FlattenBinaryTree flattenBinaryTree;

    @Before
    public void setUp() throws Exception {
        flattenBinaryTree = new FlattenBinaryTree();
    }

    @Test
    public void testFlattenBinaryTree() throws Exception {
        Assert.assertNotNull(flattenBinaryTree);
    }

    @After
    public void tearDown() throws Exception {
        flattenBinaryTree = null;
    }
}
