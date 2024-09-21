package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotatedArraySearchTest {

    private RotatedArraySearch rotatedArraySearch;

    @Before
    public void setUp() {
        rotatedArraySearch = new RotatedArraySearch();
    }

    @Test
    public void testRotatedArraySearch() {
        assertEquals(-1, rotatedArraySearch.search(new int []{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println("-------------");
        assertEquals(-1, rotatedArraySearch.search(new int []{1}, 0));
        System.out.println("-------------");
        assertEquals(4, rotatedArraySearch.search(new int []{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println("-------------");
        assertEquals(2, rotatedArraySearch.search(new int []{4, 5, 6, 0, 1, 2, 3}, 6));
        System.out.println("-------------");
        assertEquals(2, rotatedArraySearch.search(new int []{4, 5, 6, 7, 0, 1, 2}, 6));
        System.out.println("-------------");
        assertEquals(4, rotatedArraySearch.search(new int []{4, 5, 6, 0, 1, 2, 3}, 1));
        System.out.println("-------------");
        assertEquals(0, rotatedArraySearch.search(new int []{1}, 1));
    }

    @After
    public void tearDown() {
        rotatedArraySearch = null;
    }
}
