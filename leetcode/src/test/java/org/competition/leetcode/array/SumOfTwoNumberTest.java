package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class SumOfTwoNumberTest extends TestCase {

    private SumOfTwoNumber sumOfTwoNumber;

    public SumOfTwoNumberTest(String testName) {
        super(testName);
        sumOfTwoNumber = new SumOfTwoNumber();
    }

    public static Test suite() {
        return new TestSuite(SumOfTwoNumberTest.class);
    }

    public void testSumOfTwoNumber() {
        Assert.assertNotNull(sumOfTwoNumber);
        Assert.assertArrayEquals(new int[]{0, 1}, sumOfTwoNumber.sumOfTwoNumber(new int[]{2, 7, 11, 15}, 9));
    }

    public void testSumOfTwoNumber1() {
        Assert.assertArrayEquals(new int[]{1, 2}, sumOfTwoNumber.sumOfTwoNumber(new int[]{3, 2, 4}, 6));
    }

    public void testSumOfTwoNumber2() {
        Assert.assertArrayEquals(new int[]{0, 1}, sumOfTwoNumber.sumOfTwoNumber(new int[]{3, 3}, 6));
    }

}