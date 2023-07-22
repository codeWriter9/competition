package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class FindModeTest {

    private FindMode findMode;

    @Before
    public void before() {
        findMode = new FindMode();
    }

    @Test
    public void testMode() {
        assertNotNull(findMode);
        assertArrayEquals(new int[]{2}, findMode.findMode(TreeNode.node(1, null, new TreeNode(2, new TreeNode(2, null, null), null))));
        //assertArrayEquals(new int[]{0}, findMode.findMode(TreeNode.node(0, null, null)));

    }

    @After
    public void after() {
        findMode = null;
    }
}
