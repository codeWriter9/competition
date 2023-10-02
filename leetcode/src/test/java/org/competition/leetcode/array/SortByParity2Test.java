package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class SortByParity2Test {

    private SortByParity2 sortByParity2;

    @Before
    public void setUp() {
        sortByParity2 = new SortByParity2();
    }

    @Test
    public void testSortByParity2() {
        assertNotNull(sortByParity2);
        assertArrayEquals(new int[]{4, 5, 2, 7}, sortByParity2.sortArrayByParityII(new int[]{4, 2, 5, 7}));
        assertArrayEquals(new int[]{2, 3}, sortByParity2.sortArrayByParityII(new int[]{2, 3}));
    }

    @After
    public void destroy() {
        sortByParity2 = null;
    }
}
