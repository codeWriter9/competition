package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroupSizeXTest {

    private GroupSizeX groupSizeX;

    @Before
    public void setUp() {
        groupSizeX = new GroupSizeX();
    }

    @Test
    public void test() {
        assertNotNull(groupSizeX);
        assertTrue(groupSizeX.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        assertTrue(groupSizeX.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}));
        assertFalse(groupSizeX.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
        assertFalse(groupSizeX.hasGroupsSizeX(new int[]{1}));
        assertFalse(groupSizeX.hasGroupsSizeX(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}));
    }

    @After
    public void destroy() {
        groupSizeX = null;
    }
}
