package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.trees.TreeNode.node;
import static org.competition.leetcode.trees.TreeNode.tree;
import static org.junit.Assert.assertEquals;

public class MaximumDepthBSTTreeTest {

    private MaximumDepthBSTTree maximumDepthBSTTree;

    @Before
    public void before() {
        maximumDepthBSTTree = new MaximumDepthBSTTree();
    }

    @Test
    public void testMaximumDepth() {
        assertEquals(0, maximumDepthBSTTree.maxDepth(null));
        assertEquals(1, maximumDepthBSTTree.maxDepth(node(1)));
        assertEquals(2, maximumDepthBSTTree.maxDepth(tree(2, 1, 3)));
        assertEquals(5, maximumDepthBSTTree.maxDepth(tree(1, 2, 3, 4, 5)));
    }

    @After
    public void after() {
        maximumDepthBSTTree = null;
    }
}