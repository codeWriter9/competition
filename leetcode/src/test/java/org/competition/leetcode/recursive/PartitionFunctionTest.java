package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PartitionFunctionTest {

    private PartitionFunctions partitionFunction;

    @Before
    public void setUp() {
        partitionFunction = new PartitionFunctions();
    }

    @Test
    public void testPartitions() {
        assertNotNull(partitionFunction);
        assertEquals(1, partitionFunction.partitions(1)); // 1
        System.out.println();
        assertEquals(2, partitionFunction.partitions(2)); // 1 + 1, 2
        System.out.println();
        assertEquals(3, partitionFunction.partitions(3)); // 1 + 1 + 1, 2 + 1, 3
        System.out.println();
        assertEquals(5, partitionFunction.partitions(4)); // 1 + 1 + 1 + 1, 2 + 2, 2 + 1 + 1, 3 + 1, 4
        System.out.println();
    }

    @After
    public void destroy() {
        partitionFunction = null;
    }
}
