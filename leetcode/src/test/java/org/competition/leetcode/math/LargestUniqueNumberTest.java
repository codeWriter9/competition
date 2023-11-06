package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LargestUniqueNumberTest {

    private LargestUniqueNumber largestUniqueNumber;

    @Before
    public void setUp() throws Exception {
        largestUniqueNumber = new LargestUniqueNumber();
    }

    @Test
    public void testLargestUniqueNumber() {
        assertNotNull(largestUniqueNumber);
        assertEquals(8, largestUniqueNumber.largestUniqueNumber(new int[]{5, 7, 3, 9, 4, 9, 8, 3, 1}));
        assertEquals(-1, largestUniqueNumber.largestUniqueNumber(new int[]{9, 9, 8, 8}));

    }

    @After
    public void tearDown() throws Exception {
        largestUniqueNumber = null;
    }
}
