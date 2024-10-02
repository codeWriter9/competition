package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DuplicateNumberTest {

    private DuplicateNumber duplicateNumber;

    @Before
    public void setUp() {
        duplicateNumber = new DuplicateNumber();
    }

    @Test
    public void testFindDuplicate() {
        org.junit.Assert.assertEquals(2, duplicateNumber.findDuplicate(new int[] {1, 3, 4, 2, 2}));
        org.junit.Assert.assertEquals(3, duplicateNumber.findDuplicate(new int[] {3, 1, 3, 4, 2}));
        org.junit.Assert.assertEquals(3, duplicateNumber.findDuplicate(new int[] {3, 3, 3, 3, 3, 3, 1, 2, 9}));
    }

    @After
    public void tearDown() {
        duplicateNumber = null;
    }
}
