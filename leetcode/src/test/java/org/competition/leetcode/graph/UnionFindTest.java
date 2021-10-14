package org.competition.leetcode.graph;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnionFindTest {

    private UnionFind unionFind;

    @Before
    public void before() {

    }

    @Test
    public void testUnionFindNotNull() {
        unionFind = new UnionFind(0);
        assertNotNull(unionFind);
    }

    /**
     *
     * 1-2-5-6-7 3-8-9 4
     *
     */
    @Test
    public void testUnionFind() {
        unionFind = new UnionFind(10);
        unionFind.union(1, 2);
        unionFind.union(2, 5);
        unionFind.union(5, 6);
        unionFind.union(6, 7);
        unionFind.union(3, 8);
        unionFind.union(8, 9);
        assertTrue(unionFind.connected(1, 5));
        assertTrue(unionFind.connected(3, 9));
        assertFalse(unionFind.connected(1, 4));
    }

    @After
    public void after() {
        unionFind = null;
    }
}