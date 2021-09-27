package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class SortByParityTest {

    private SortByParity sortByParity;

    @Before
    public void before() {
        sortByParity = new SortByParity();
    }

    @Test
    public void testParity() {
        assertNotNull(sortByParity);
        assertArrayEquals(new int[]{2, 4, 3, 1}, sortByParity.sortArrayByParity(new int[]{3, 1, 2, 4}));
    }

    @After
    public void after() {
        sortByParity = null;
    }

}
