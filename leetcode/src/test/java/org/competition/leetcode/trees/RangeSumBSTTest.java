package org.competition.leetcode.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RangeSumBSTTest {

    private RangeSumBST rangeSumBST;

    @Before
    public void setUp() {
        rangeSumBST = new RangeSumBST();
    }

    @Test
    public void test() {
        assertNotNull(rangeSumBST);
        assertEquals(32,
                rangeSumBST.rangeSumBST(
                        new TreeNode(10,
                                new TreeNode(5,
                                        new TreeNode(3),
                                        new TreeNode(7)),
                                new TreeNode(15, null,
                                        new TreeNode(18))), 7, 15));
        ;assertEquals(23, rangeSumBST.rangeSumBST(new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(1), null),
                        new TreeNode(7,
                                new TreeNode(6), null)),
                new TreeNode(15,
                        new TreeNode(13), new TreeNode(18))), 6, 10));
    }

    @After
    public void destroy() {
        rangeSumBST = null;
    }
}
