package org.competition.leetcode.math;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SelfDividingNumbersTest {

    private SelfDividingNumbers selfDividingNumbers;

    @Before
    public void before() {
        selfDividingNumbers = new SelfDividingNumbers();
    }

    @Test
    public void testSelfDividingNumbers() {
        assertNotNull(selfDividingNumbers);
        assertEquals(13, selfDividingNumbers.selfDividingNumbers(1, 22).size());
        assertEquals(4, selfDividingNumbers.selfDividingNumbers(47, 85).size());
    }

    @After
    public void after() {
        selfDividingNumbers = null;
    }
}
