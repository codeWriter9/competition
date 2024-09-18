package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @Before
    public void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void testSearchInsert() {
        // this will find an exact match
        org.junit.Assert.assertEquals(2, searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 5));
        // this will find the position to insert
        org.junit.Assert.assertEquals(1, searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 2));
        // this will find the position to insert but out of the array
        org.junit.Assert.assertEquals(4, searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 7));
    }

    @After
    public void tearDown() {
        searchInsertPosition = null;
    }
}
