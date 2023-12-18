package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortColorsTest {

    private SortColors sortColors;

    @Before
    public void setUp() throws Exception {
        sortColors = new SortColors();
    }

    @Test
    public void test() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors(nums);
        org.junit.Assert.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
        nums = new int[]{2, 0, 1};
        sortColors.sortColors(nums);
        org.junit.Assert.assertArrayEquals(new int[]{0, 1, 2}, nums);
    }


    @After
    public void tearDown() throws Exception {
        sortColors = null;
    }
}
