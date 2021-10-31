package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.trees.TreeNode.tree;
import static org.junit.Assert.*;

public class SameTreeTest {

    private SameTree sameTree;

    @Before
    public void before() {
        sameTree = new SameTree();
    }

    @Test
    public void testSameTreeNotNull() {
        assertNotNull(sameTree);
    }

    @Test
    public void testSameTree() {
        assertTrue(sameTree.isSameTree(tree(1, 2, 3, 4), tree(1, 2, 3, 4)));
    }

    @Test
    public void testSameTree2() {
        assertFalse(sameTree.isSameTree(tree(1, 1, 4), tree(1, 2, 4)));
    }

    @After
    public void after() {
        sameTree = new SameTree();
    }

}
