package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ArrayPartitionTest {

    private ArrayPartition arrayPartition;

    @Before
    public void setUp() {
        arrayPartition = new ArrayPartition();
    }

    @Test
    public void testArrayPairSum() {
        assertNotNull(arrayPartition);
        assertEquals(4, arrayPartition.arrayPairSum(new int[]{1, 4, 3, 2}));
        assertEquals(9, arrayPartition.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
    }

    @After
    public void tearDown() {
        arrayPartition = null;
    }
}