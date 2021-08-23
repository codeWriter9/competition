package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ReverseStringInPlaceTest {

    private ReverseStringInPlace reverseStringInPlace;

    @Before
    public void before() {
        reverseStringInPlace = new ReverseStringInPlace();
    }

    @Test
    public void testReverseStringInPlace() {
        Assert.assertNotNull(reverseStringInPlace);
        Assert.assertEquals("Shoddy", reverseStringInPlace.reverseString("yddohS"));
        Assert.assertEquals("", reverseStringInPlace.reverseString(""));
        Assert.assertNull(reverseStringInPlace.reverseString(null));
        Assert.assertEquals("malayalaM", reverseStringInPlace.reverseString("Malayalam"));
    }

    @After
    public void after() {
        reverseStringInPlace = null;
    }
}
