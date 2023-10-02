package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonotonicArrayTest {

    private MonotonicArray monotonicArray;

    @Before
    public void before() {
        monotonicArray = new MonotonicArray();
    }

    @Test
    public void test() {
        assertNotNull(monotonicArray);
        assertTrue(monotonicArray.isMonotonic(new int[]{1, 2, 2, 3}));
        assertTrue(monotonicArray.isMonotonic(new int[]{6, 5, 4, 4}));
        assertFalse(monotonicArray.isMonotonic(new int[]{1, 3, 2}));
    }

    @After
    public void after() {
        monotonicArray = null;
    }
}
