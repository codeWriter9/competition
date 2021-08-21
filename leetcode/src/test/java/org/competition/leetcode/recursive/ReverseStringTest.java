package org.competition.leetcode.recursive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class ReverseStringTest extends TestCase {

    private ReverseString reverseString;

    public ReverseStringTest(String name) {
        super(name);
        reverseString = new ReverseString();
    }

    public static Test suite() {
        return new TestSuite(ReverseStringTest.class);
    }

    public void testReverseString() {
        Assert.assertNotNull(reverseString);
        Assert.assertEquals("Shoddy", reverseString.reverseString("yddohS"));
        Assert.assertEquals("", reverseString.reverseString(""));
        Assert.assertEquals(null, reverseString.reverseString(null));
        Assert.assertEquals("malayalaM", reverseString.reverseString("Malayalam"));
    }
}
