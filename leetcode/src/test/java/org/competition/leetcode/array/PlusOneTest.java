package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest extends TestCase {

    private PlusOne plusOne;

    public PlusOneTest(String testName) {
        super(testName);
        plusOne = new PlusOne();
    }

    public static Test suite() {
        return new TestSuite(PlusOneTest.class);
    }

    public void testPlusOne() {
        assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, plusOne.plusOne(new int[]{9, 9, 9}));
        assertArrayEquals(new int[]{9, 9, 1}, plusOne.plusOne(new int[]{9, 9, 0}));

    }
}
