package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class SingleNumberTest extends TestCase {

    private SingleNumber singleNumber;

    public SingleNumberTest(String testName) {
        super(testName);
        singleNumber = new SingleNumber();
    }

    public static Test suite() {
        return new TestSuite(SingleNumberTest.class);
    }

    public void testSingleNumber() {
        Assert.assertNotNull(singleNumber);
        Assert.assertEquals( 3, singleNumber.singleNumber(new int []{1, 1, 2, 3, 2}));
        Assert.assertEquals( 3, singleNumber.singleNumberUsingXOR(new int []{1, 1, 2, 3, 2}));
    }

    public void testSingleNumber2() {
        Assert.assertNotNull(singleNumber);
        Assert.assertEquals( 4, singleNumber.singleNumber(new int []{1, 1, 2, 3, 2, 3, 4, 5, 5, 6, 7, 6, 7}));
        Assert.assertEquals( 4, singleNumber.singleNumberUsingXOR(new int []{1, 1, 2, 3, 2, 3, 4, 5, 5, 6, 7, 6, 7}));
    }
}
