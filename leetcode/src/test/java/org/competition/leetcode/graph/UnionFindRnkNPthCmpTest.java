package org.competition.leetcode.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnionFindRnkNPthCmpTest {

    private UnionFindRnkNPthCmp unionFindRnkNPthCmp;

    @Before
    public void before() {

    }

    @Test
    public void testUnionFindNotNull() {
        unionFindRnkNPthCmp = new UnionFindRnkNPthCmp(0);
        assertNotNull(unionFindRnkNPthCmp);
    }

    @Test
    public void testUnionFind() {
        unionFindRnkNPthCmp = new UnionFindRnkNPthCmp(10);
        unionFindRnkNPthCmp.edges(new int[][]{{1, 2}, {2, 5}, {5, 6}, {6, 7}, {3, 8}, {8, 9}});
        assertTrue(unionFindRnkNPthCmp.connected(1, 5));
        assertTrue(unionFindRnkNPthCmp.connected(5, 7));
        assertFalse(unionFindRnkNPthCmp.connected(4, 9));
    }

    @After
    public void after() {
        unionFindRnkNPthCmp = null;
    }
}