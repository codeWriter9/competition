package org.competition.leetcode.math;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MissingNumberTest extends TestCase {

    private MissingNumber missingNumber;

    public MissingNumberTest(String testName) {
        super(testName);
        missingNumber = new MissingNumber();
    }

    public static Test suite() {
        return new TestSuite(MissingNumberTest.class);
    }

    public void testMissingNumberTest() {
        assertEquals(2, missingNumber.missingNumber(new int[]{3, 0, 1}));
        assertEquals(2, missingNumber.missingNumber(new int[]{0, 1}));
        assertEquals(8, missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, missingNumber.missingNumber(new int[]{0}));
    }
}
