package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import static org.competition.leetcode.trees.TreeNode.inOrder;
import static org.competition.leetcode.trees.TreeNode.tree;

public class TreeNodeTest {

    private TreeNode root;

    @Before
    public void before() {
        root = new TreeNode(2);
    }

    @Test
    public void testTreeNode() {
        root = tree(1, 2, 3, 4, 5);
        inOrder(root);
    }

    @After
    public void after() {

    }
}
