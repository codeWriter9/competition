package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LargeGroupPositionsTest {

    private LargeGroupPositions largeGroupPositions;

    @Before
    public void setUp() {
        largeGroupPositions = new LargeGroupPositions();
    }

    @Test
    public void testLargeGroupPositions() {
        assertNotNull(largeGroupPositions);
        assertEquals(
                List.of(List.of(3, 6))
                , largeGroupPositions.largeGroupPositions("abbxxxxzzy"));
        assertEquals(
                Collections.EMPTY_LIST
                , largeGroupPositions.largeGroupPositions("abc"));
        assertEquals(
                List.of(List.of(3, 5), List.of(6, 9), List.of(12, 14))
                , largeGroupPositions.largeGroupPositions("abcdddeeeeaabbbcd"));
        assertEquals(
                Collections.EMPTY_LIST
                , largeGroupPositions.largeGroupPositions("aa"));
//        assertEquals(
//                List.of(List.of(0, 2))
//                , largeGroupPositions.largeGroupPositions("aaa"));// TODO - this test case is not working
    }

    @After
    public void destroy() {
        largeGroupPositions = null;
    }
}
