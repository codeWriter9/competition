package org.competition.leetcode.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphValidTreeTest {

    private GraphValidTree graphValidTree;

    @Before
    public void before() {
        graphValidTree = new GraphValidTree();
    }

    @Test
    public void testGraphValidTreeNotNull() {
        assertNotNull(graphValidTree);
    }

    @Test
    public void testGraphValidTree() {
        assertFalse(graphValidTree.validTree(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}));
    }

    @Test
    public void testGraphValidTree2() {
        assertFalse(graphValidTree.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3},{1, 3}, {1, 4}}));
    }

    @Test
    public void testGraphValidTree3() {
        assertTrue(graphValidTree.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
    }

    @After
    public void after() {
        graphValidTree = null;
    }

}