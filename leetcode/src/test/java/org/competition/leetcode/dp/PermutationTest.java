package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PermutationTest {

    private Permutation permutation;

    @Before
    public void before() {
        permutation = new Permutation();
    }

    @Test
    public void testPermutationNotNull() {
        assertNotNull(permutation);
    }

    @Test
    public void testPermutationNullArray() {
        assertEquals(asList(new ArrayList<Integer>()), permutation.permute(null));
    }

    @Test
    public void testPermutation() {
        assertEquals(asList(asList(1, 2, 3), asList(1, 3, 2), asList(2, 1, 3),
                asList(2, 3, 1), asList(3, 1, 2), asList(3, 2, 1)), permutation.permute(new int[]{1, 2, 3}));
    }

    @After
    public void after() {
        permutation = null;
    }
}