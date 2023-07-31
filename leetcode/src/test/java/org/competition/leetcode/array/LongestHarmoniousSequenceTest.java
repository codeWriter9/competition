package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LongestHarmoniousSequenceTest {

    private LongestHarmoniousSequence longestHarmoniousSequence;

    @Before
    public void setUp() {
        longestHarmoniousSequence = new LongestHarmoniousSequence();
    }

    @Test
    public void testLongestHarmoniousSequence() {
        assertNotNull(longestHarmoniousSequence);
        assertEquals(5, longestHarmoniousSequence.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        assertEquals(2, longestHarmoniousSequence.findLHS(new int[]{1, 2, 3, 4}));
        assertEquals(0, longestHarmoniousSequence.findLHS(new int[]{1, 1, 1, 1}));
    }

    @After
    public void tearDown() {
        longestHarmoniousSequence = null;
    }
}
