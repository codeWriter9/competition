package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LevenshteinDistanceTest {

    private LevenshteinDistance levenshteinDistance;

    @Before
    public void setUp() {
        levenshteinDistance = new LevenshteinDistance();
    }

    @Test
    public void test() {
        assertNotNull(levenshteinDistance);
        assertEquals(levenshteinDistance.minDistance("horse", "ros"), 3);
        assertEquals(levenshteinDistance.minDistance("intention", "execution"), 5);

    }

    @After
    public void destroy() {
        levenshteinDistance = null;
    }
}
