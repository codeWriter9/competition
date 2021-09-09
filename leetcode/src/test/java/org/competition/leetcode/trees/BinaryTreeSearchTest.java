package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.competition.leetcode.trees.TreeNode.node;
import static org.competition.leetcode.trees.TreeNode.tree;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BinaryTreeSearchTest {

    private BinaryTreeSearch binaryTreeSearch;

    @Before
    public void before() {
        binaryTreeSearch = new BinaryTreeSearch();
    }

    @Test
    public void testBinarySearch() {
        assertNull(binaryTreeSearch.searchBST(null, 0));
        assertEquals(node(1), binaryTreeSearch.searchBST(tree(1, 2, 3, 4), 1));
        assertEquals(node(2), binaryTreeSearch.searchBST(tree(1, 2, 3, 4), 2));
        assertNull(binaryTreeSearch.searchBST(tree(1, 2, 3, 4), 5));
    }

    @After
    public void after() {
        binaryTreeSearch = null;
    }

}
