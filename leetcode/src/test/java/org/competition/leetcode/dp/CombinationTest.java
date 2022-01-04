package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CombinationTest {

    private Combination combination;

    @Before
    public void before() {
        combination = new Combination();
    }

    @Test
    public void testCombinationNotNull() {
        assertNotNull(combination);
    }

    @Test
    public void testCombination() {
        assertEquals(asList(asList(1)), combination.combine(1, 1));
    }

    @After
    public void after() {
        combination = null;
    }

}
