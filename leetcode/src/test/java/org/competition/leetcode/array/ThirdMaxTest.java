package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ThirdMaxTest {

    private ThirdMax thirdMax;

    @Before
    public void before() {
        thirdMax = new ThirdMax();
    }

    @Test
    public void testThirdMax() {
        assertNotNull(thirdMax);
        assertEquals(1, thirdMax.thirdMax(new int[]{3, 2, 1}));
        assertEquals(2, thirdMax.thirdMax(new int[]{1, 2}));
        assertEquals(1, thirdMax.thirdMax(new int[]{2, 2, 3, 1}));
        assertEquals(-2, thirdMax.thirdMax(new int[]{3,-2,1,-2}));
    }

    @After
    public void after() {
        thirdMax = null;
    }
}
