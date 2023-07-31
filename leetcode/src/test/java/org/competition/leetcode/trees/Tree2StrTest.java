package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Tree2StrTest {

    private Tree2Str tree2Str;

    @Before
    public void before() {
        tree2Str = new Tree2Str();
    }

    @Test
    public void testTree2Str() {
        assertNotNull(tree2Str);
        assertEquals("1(2(4))(3)", tree2Str.tree2str(new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3))));
        assertEquals("1(2()(4))(3)", tree2Str.tree2str(new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3))));
    }

    @After
    public void after() {
        tree2Str = null;
    }
}
