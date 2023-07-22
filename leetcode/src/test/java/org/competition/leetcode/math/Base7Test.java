package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Base7Test {

    private Base7 base7;

    @Before
    public void before() {
        base7 = new Base7();
    }

    @Test
    public void testBase7() {
        assertNotNull(base7);
        assertEquals("202", base7.convertToBase7(100));
        assertEquals("-10", base7.convertToBase7(-7));
    }

    @After
    public void after() {
        base7 = null;
    }
}
