package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class ColoringABorderTest {

    private ColoringABorder coloringABorder;

    @Before
    public void setUp() throws Exception {
        coloringABorder = new ColoringABorder();
    }

    @Test
    public void testColorBorder() {
        assertNotNull(coloringABorder);
        assertArrayEquals(new int[][]{{3, 3}, {3, 2}}
                , coloringABorder.colorBorder(new int[][]{{1, 1}, {1, 2}}, 0, 0, 3));
        assertArrayEquals(new int[][]{{1, 3, 3}, {2, 3, 3}}
                , coloringABorder.colorBorder(new int[][]{{1, 2, 2}, {2, 3, 3}}, 0, 1, 3));
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}
                , coloringABorder.colorBorder(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, 1, 1, 2));
    }

    @After
    public void tearDown() throws Exception {
        coloringABorder = null;
    }
}
