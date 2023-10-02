package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class NumberOfLinesTest {

    private NumberOfLines numberOfLines;

    @Before
    public void setUp() throws Exception {
        numberOfLines = new NumberOfLines();
    }

    @Test
    public void testNumberOfLines() {
        assertNotNull(numberOfLines);
        assertArrayEquals(new int[]{3, 60}, numberOfLines.numberOfLines(
                new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "abcdefghijklmnopqrstuvwxyz"
        ));
        assertArrayEquals(new int[]{2, 4}, numberOfLines.numberOfLines(
                new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "bbbcccdddaaa"
        ));
    }

    @After
    public void tearDown() throws Exception {
        numberOfLines = null;
    }
}
