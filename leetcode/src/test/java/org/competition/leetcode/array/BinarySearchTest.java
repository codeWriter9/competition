package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @Before
    public void before() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void testBinarySearch() {
        assertNotNull(binarySearch);
        assertEquals(4, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        assertEquals(-1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 13));
        assertEquals(-1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, -2));
    }

    @After
    public void after() {
        binarySearch = null;
    }
}