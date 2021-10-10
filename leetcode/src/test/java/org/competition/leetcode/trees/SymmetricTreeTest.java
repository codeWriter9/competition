package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricTreeTest {

    private SymmetricTree symmetricTree;
    private TreeNode root;

    @Before
    public void before() {
        symmetricTree = new SymmetricTree();
    }

    @Test
    public void testSymmetricTest1() {
        assertNotNull(symmetricTree);
        root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void testSymmetricTest2() {
        assertNotNull(symmetricTree);
        root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));
        assertFalse(symmetricTree.isSymmetric(root));
    }

    @After
    public void after() {
        symmetricTree = null;
        root = null;
    }
}