package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DegreeOfAnArrayTest {

    private DegreeOfAnArray degreeOfAnArray;

    @Before
    public void setUp() {
        degreeOfAnArray = new DegreeOfAnArray();
    }

    @Test
    public void testDegreeOfAnArray() {
        Assert.assertNotNull(degreeOfAnArray);
        Assert.assertEquals(2, degreeOfAnArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        Assert.assertEquals(6, degreeOfAnArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    @After
    public void destroy() {
        degreeOfAnArray = null;
    }
}
