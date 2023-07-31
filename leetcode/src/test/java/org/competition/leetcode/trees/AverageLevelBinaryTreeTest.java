package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AverageLevelBinaryTreeTest {

    private AverageLevelBinaryTree averageLevelBinaryTree;

    @Before
    public void setUp() throws Exception {
        averageLevelBinaryTree = new AverageLevelBinaryTree();
    }

    @Test
    public void testAverageOfLevels() {
        assertNotNull(averageLevelBinaryTree);
        assertEquals(Arrays.asList(3.00000, 14.50000, 11.00000), averageLevelBinaryTree.averageOfLevels(
                new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))
                )));
        assertEquals(Arrays.asList(3.00000, 14.50000, 11.00000), averageLevelBinaryTree.averageOfLevels(
                new TreeNode(3, new TreeNode(9, new TreeNode(15), new TreeNode(7)), new TreeNode(20))
        ));

    }

    @After
    public void destroy() {
        averageLevelBinaryTree = null;
    }
}