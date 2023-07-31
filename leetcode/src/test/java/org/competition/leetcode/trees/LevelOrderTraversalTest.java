package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LevelOrderTraversalTest {

    private LevelOrderTraversal levelOrderTraversal;

    @Before
    public void setUp() throws Exception {
        levelOrderTraversal = new LevelOrderTraversal();
    }

    @Test
    public void testLevelOrderTraversal() throws Exception {
        assertNotNull(levelOrderTraversal);
        assertEquals(Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7))
                , levelOrderTraversal.levelOrderTraversal(
                        new TreeNode(3,
                                new TreeNode(9),
                                new TreeNode (20, new TreeNode(15), new TreeNode(7)))
                ));
        assertEquals(Arrays.asList(Arrays.asList(1))
                , levelOrderTraversal.levelOrderTraversal(
                        new TreeNode(1)
                ));
        assertEquals(Arrays.asList(), levelOrderTraversal.levelOrderTraversal(null));
    }

    @After
    public void tearDown() throws Exception {

    }
}
