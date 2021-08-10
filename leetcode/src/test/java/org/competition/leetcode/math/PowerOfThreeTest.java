package org.competition.leetcode.math;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PowerOfThreeTest extends TestCase {

    private PowerOfThree powerOfThree;

    public PowerOfThreeTest(String testName) {
        super(testName);
        powerOfThree = new PowerOfThree();
    }

    public static Test suite() {
        return new TestSuite(PowerOfThreeTest.class);
    }

    public void testPowerOfThreeTest() {
        assertNotNull(powerOfThree);
        assertTrue(powerOfThree.isPowerOfThree(3));
        assertTrue(powerOfThree.isPowerOfThree(9));
        assertFalse(powerOfThree.isPowerOfThree(1));
        assertFalse(powerOfThree.isPowerOfThree(0));
    }

}
