package org.competition.leetcode.miscellaneous;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RecentCounterTest {

    private RecentCounter recentCounter;

    @Before
    public void setUp() {
        recentCounter = new RecentCounter();
    }

    @Test
    public void testPing() {
        assertNotNull(recentCounter);
        assertEquals(1, recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));
        recentCounter.ping(3002);
    }

    @After
    public void destroy() {
        recentCounter = null;
    }
}
