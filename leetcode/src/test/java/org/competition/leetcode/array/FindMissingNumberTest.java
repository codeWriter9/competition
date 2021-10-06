package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FindMissingNumberTest {

    private FindMissingNumber findMissingNumber;

    @Before
    public void before() {
        findMissingNumber = new FindMissingNumber();
    }

    @Test
    public void testFindMissingNumber() {
        assertNotNull(findMissingNumber);
        assertEquals(list(5, 6), findMissingNumber.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        assertEquals(list(2), findMissingNumber.findDisappearedNumbers(new int[]{1, 1}));
    }

    private List<Integer> list(Integer... nums) {
        return Arrays.asList(nums);
    }

    @After
    public void after() {
        findMissingNumber = null;
    }

}
