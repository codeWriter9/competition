package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class FlipAndInvertImageTest {

    private FlipAndInvertImage flipAndInvertImage;

    @Before
    public void setUp() throws Exception {
        flipAndInvertImage = new FlipAndInvertImage();
    }

    @Test
    public void testFlipAndInvertImage() throws Exception {
        assertNotNull(flipAndInvertImage);
        assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}},
                flipAndInvertImage.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}));
        assertArrayEquals(new int[][]{{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}},
                flipAndInvertImage.flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
    }

    @After
    public void tearDown() throws Exception {
        flipAndInvertImage = null;
    }
}
