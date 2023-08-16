package org.competition.leetcode.bit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PrimeBitSetTest {

    private PrimeBitSet primeBitSet;

    @Before
    public void setUp() throws Exception {
        primeBitSet = new PrimeBitSet();
    }

    @Test
    public void testPrimeBitSets() {
        assertNotNull(primeBitSet);
        assertEquals(primeBitSet.countPrimeSetBits(6, 10), 4);
        assertEquals(primeBitSet.countPrimeSetBits(10, 15), 5);
    }

    @After
    public void tearDown() throws Exception {
        primeBitSet = null;
    }
}
