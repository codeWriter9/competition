package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistributeCandiesTest {

    private DistributeCandies distributeCandies;

    @Before
    public void setUp() {
        distributeCandies = new DistributeCandies();
    }

    @Test
    public void testDistributeCandies() {
        assertNotNull(distributeCandies);
        assertEquals(3, distributeCandies.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        assertEquals(2, distributeCandies.distributeCandies(new int[]{1, 1, 2, 3}));
    }

    @After
    public void destroy() {

    }
}
