package org.competition.leetcode.recursive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class SumOfDigitsTest extends TestCase {

    private SumOfDigits sumOfDigits;

    public SumOfDigitsTest(String name) {
        super(name);
        sumOfDigits = new SumOfDigits();
    }

    public static Test suite() {
        return new TestSuite(SumOfDigitsTest.class);
    }

    public void testSumOfDigits() {
        Assert.assertNotNull(sumOfDigits);
        for (int i =0;i < 10;i++) {
            Assert.assertEquals(i, sumOfDigits.sumOfDigits(i));
        }
        int count = 1;
        for (int i =10;i < 20;i++) {
            Assert.assertEquals(count++, sumOfDigits.sumOfDigits(i));
        }
        count = 1;
        for (int i =100;i < 110;i++) {
            Assert.assertEquals(count++, sumOfDigits.sumOfDigits(i));
        }
        Assert.assertEquals(10, sumOfDigits.sumOfDigits(451));
    }
}