package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BinaryTreeLevelOrderTraversalTest {

    private BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal;

    @Before
    public void before() {
        binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
    }

    @Test
    public void testBSTLevelOrder() {
        assertNull(binaryTreeLevelOrderTraversal.levelOrder(null));
        assertEquals(asList(asList(0)), binaryTreeLevelOrderTraversal.levelOrder(new TreeNode(0)));
        assertEquals(asList(asList(2), asList(1, 3)), binaryTreeLevelOrderTraversal.levelOrder(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }

    @After
    public void after() {
        binaryTreeLevelOrderTraversal = null;
    }

}
