package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.trees.TreeNode.tree;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidBinarySearchTreeTest {

    private ValidBinarySearchTree validBinarySearchTree;

    @Before
    public void before() {
        validBinarySearchTree = new ValidBinarySearchTree();
    }

    @Test
    public void testValid() {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        root.right = right;
        root.left = left;
        left = new TreeNode(3);
        right = new TreeNode(6);
        root.right.right = right;
        root.right.left = left;
        assertFalse(validBinarySearchTree.isValidBST(root));
        assertTrue(validBinarySearchTree.isValidBST(tree(2, 1, 3)));
        left = new TreeNode(1);
        right = new TreeNode(6);
        root = new TreeNode(5, left, right);
        right.right = new TreeNode(7);
        right.left = new TreeNode(4);
        assertFalse(validBinarySearchTree.isValidBST(root));
    }

    @After
    public void after() {
        validBinarySearchTree = null;
    }

}
