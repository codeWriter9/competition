package org.competition.leetcode.math;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PrimaryCountTest extends TestCase {

    private PrimaryCount primaryCount;

    public PrimaryCountTest(String testName) {
        super(testName);
        primaryCount = new PrimaryCount();
    }

    public static Test suite() {
        return new TestSuite(PrimaryCountTest.class);
    }

    public void testPrimaryCount() {
        long start = System.currentTimeMillis();
        assertEquals(0, primaryCount.countPrimes(0));
        assertEquals(4, primaryCount.countPrimes(10));
        assertEquals(25, primaryCount.countPrimes(100));
        assertEquals(168, primaryCount.countPrimes(1000));
        long end = System.currentTimeMillis();
        System.out.println("Time Needed:" + (end - start) + ":milis:");
    }
}
