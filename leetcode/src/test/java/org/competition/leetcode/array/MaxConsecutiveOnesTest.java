package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes maxConsecutiveOnes;

    @Before
    public void before() {
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    public void testConsecutiveOnesI() {
        assertNotNull(maxConsecutiveOnes);
        assertEquals(0, maxConsecutiveOnes.findMaxConsecutiveOnesI(new int[]{0, 0, 0}));
        assertEquals(2, maxConsecutiveOnes.findMaxConsecutiveOnesI(new int[]{1, 0, 1, 1, 0}));
        assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnesI(new int[]{0, 1, 1, 1, 0, 0, 1, 1, 0}));
        assertEquals(5, maxConsecutiveOnes.findMaxConsecutiveOnesI(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testConsecutiveOnesII() {
        assertNotNull(maxConsecutiveOnes);
        assertEquals(4, maxConsecutiveOnes.findMaxConsecutiveOnesII(new int[]{1, 0, 1, 1, 0}));
        assertEquals(4, maxConsecutiveOnes.findMaxConsecutiveOnesII(new int[]{1, 0, 1, 1, 0, 1}));
    }

    @After
    public void after() {
        maxConsecutiveOnes = null;
    }

}