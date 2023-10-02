package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class ShortestDistanceCharTest {

    private ShortestDistanceChar shortestDistanceChar;

    @Before
    public void setUp() throws Exception {
        shortestDistanceChar = new ShortestDistanceChar();
    }

    @Test
    public void testShortestToChar() throws Exception {
        assertNotNull(shortestDistanceChar);
        assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
                shortestDistanceChar.shortestToChar("loveleetcode", 'e'));
        assertArrayEquals(new int[]{3, 2, 1, 0},
                shortestDistanceChar.shortestToChar("aaab", 'b'));
    }

    @After
    public void tearDown() throws Exception {
        shortestDistanceChar = null;
    }
}
