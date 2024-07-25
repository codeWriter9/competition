package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KthSmallestInBSTTest {

    private KthSmallestInBST kthSmallestInBST;

    @Before
    public void before() {
        kthSmallestInBST = new KthSmallestInBST();
        assertNotNull(kthSmallestInBST);
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        assertEquals(1, kthSmallestInBST.kthSmallest(root, 1));
        root = new TreeNode(5, new TreeNode(3,
                new TreeNode(2, new TreeNode(1), null), new TreeNode(4)), new TreeNode(6));
        assertEquals(3, kthSmallestInBST.kthSmallest(root, 3));
    }

    @After
    public void after() {
        kthSmallestInBST = null;
    }
}
