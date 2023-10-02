package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RGBTest {

    private RGB rgb;

    @Before
    public void setUp() throws Exception {
        rgb = new RGB();
    }

    @Test
    public void testRGB() {
        assertNotNull(rgb);
        assertEquals("#11ee66", rgb.similarRGB("#11ee66"));
        assertEquals("#5544dd", rgb.similarRGB("#5544dd"));
    }

    @After
    public void tearDown() throws Exception {
        rgb = null;
    }
}
