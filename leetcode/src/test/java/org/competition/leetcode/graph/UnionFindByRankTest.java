package org.competition.leetcode.graph;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnionFindByRankTest {

    private UnionFindByRank unionFindByRank;

    @Before
    public void before() {

    }

    @Test
    public void testUnionFindByRankNotNull() {
        unionFindByRank = new UnionFindByRank(0);
        assertNotNull(unionFindByRank);
    }

    @Test
    public void testUnionFindByRank() {
        unionFindByRank = new UnionFindByRank(10);
        unionFindByRank.union(1, 2);
        unionFindByRank.union(2, 5);
        unionFindByRank.union(5, 6);
        unionFindByRank.union(6, 7);
        unionFindByRank.union(3, 8);
        unionFindByRank.union(8, 9);
        assertTrue(unionFindByRank.connected(1, 5));
        assertTrue(unionFindByRank.connected(5, 7));
        assertFalse(unionFindByRank.connected(4, 9));
    }

    @After
    public void after() {
        unionFindByRank = null;
    }
}