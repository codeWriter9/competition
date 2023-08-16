package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KthLargestTest {

    private KthLargest kthLargest;

    @Before
    public void before() {
        kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
    }

    @Test
    public void testKthLargest() {
        assertNotNull(kthLargest); // 2, 4, 5, 8
        assertEquals( 4, kthLargest.add(3)); // 2, 3, 4, 5, 8 -> 2, 3, 5, 8
        assertEquals( 5, kthLargest.add(5)); // 2, 3, 5, 5, 8 -> 2, 3, 5, 8
        assertEquals( 5, kthLargest.add(10)); // 2, 3, 5, 8, 10 -> 2, 3, 8, 10
        assertEquals( 8, kthLargest.add(9)); // 2, 3, 8, 9, 10 -> 2, 3, 9, 10
        // assertEquals( 8, kthLargest.add(4)); // 2, 3, 4, 4, 5, 5, 8, 9 - Unable to Understand this

    }

    @After
    public void after() {
        kthLargest = null;
    }
}
