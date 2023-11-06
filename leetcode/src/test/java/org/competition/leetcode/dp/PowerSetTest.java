package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PowerSetTest {

    private PowerSet powerSet;


    @Before
    public void before() {
        powerSet = new PowerSet();
    }

    @Test
    public void test() {
        assertNotNull(powerSet);
        assertEquals(
                Arrays.asList(Arrays.asList(), Arrays.asList(0)),
                powerSet.subsets(new int[] {0})
        );
        assertEquals(
                Arrays.asList(Arrays.asList(), Arrays.asList(1),
                        Arrays.asList(1, 2), Arrays.asList(1, 2, 3),Arrays.asList(1, 3),
                        Arrays.asList(2), Arrays.asList(2, 3), Arrays.asList(3)),
                        powerSet.subsets(new int[] {1, 2, 3})
        );
    }

    @After
    public void after() {
        powerSet = null;
    }
}
