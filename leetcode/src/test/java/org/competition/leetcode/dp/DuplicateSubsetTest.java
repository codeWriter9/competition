package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DuplicateSubsetTest {

    private DuplicateSubset duplicateSubset;

    @Before
    public void before() {
        duplicateSubset = new DuplicateSubset();
    }

    @Test
    public void test() {
        assertNotNull(duplicateSubset);
        assertEquals(asList(
                asList(), asList(0)
        ),
                duplicateSubset.subsetsWithDup(new int[]{0}));
        assertEquals(asList(
                        asList(), asList(1), asList(1,2), asList(1, 2, 2), asList(2), asList(2, 2)
                ),
                duplicateSubset.subsetsWithDup(new int[]{1,2,2}));
    }

    @After
    public void after() {
        duplicateSubset = null;
    }
}
