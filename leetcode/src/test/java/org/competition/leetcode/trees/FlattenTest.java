package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FlattenTest {

    private Flatten flatten;

    @Before
    public void before() {
        flatten = new Flatten();
    }

    @Test
    public void testFlatten() {
        assertNotNull(flatten);
        TreeNode root = new TreeNode(0);
        TreeNode fRoot = new TreeNode(0);
        flatten.flatten(root);
        assertTrue(TreeNode.equals(root, fRoot));
        root = TreeNode.tree(1, 2, 5, 3, 4, 5, 6);
        TreeNode.equals(root, root);
        root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6)));
        fRoot = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null,
                new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))))); // flatten(root);
        TreeNode.preOrder(root);
        System.out.println("");
        flatten.flatten(root);
        System.out.println("");
        TreeNode.preOrder(root);
//        assertTrue(TreeNode.equals(root, fRoot)); TODO: Fix this
    }

    @After
    public void after() {
        flatten = null;
    }
}
