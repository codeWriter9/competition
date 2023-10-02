package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondMinimumNodeTest {

    private SecondMinimumNode secondMinimumNode;

    @Before
    public void setUp() throws Exception {
        secondMinimumNode = new SecondMinimumNode();
    }

    @Test
    public void testSecondMinimumNode() throws Exception {
        assertNotNull(secondMinimumNode);
        assertEquals(5,
                secondMinimumNode.findSecondMinimumValue(
                        new TreeNode(2,
                                new TreeNode(2),
                                new TreeNode(5,
                                        new TreeNode(5),
                                        new TreeNode(7)))));
        assertEquals(-1,
                secondMinimumNode.findSecondMinimumValue(new TreeNode(2,
                        new TreeNode(2),
                        new TreeNode(2))));

    }

    @After
    public void tearDown() throws Exception {
        secondMinimumNode = null;
    }
}
