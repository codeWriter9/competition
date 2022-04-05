package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KSubsetTest {

    private KSubset kSubset;

    @Before
    public void setUp() {
        kSubset = new KSubset();
    }

    @Test
    public void testKSubset() {
        assertNotNull(kSubset);
        assertEquals(3, kSubset.subsets(new int[]{1, 2, 3}, 1).size());
        assertEquals(6, kSubset.subsets(new int[]{1, 2, 3, 4}, 2).size());
    }

    @After
    public void close() {
        kSubset = null;
    }
}