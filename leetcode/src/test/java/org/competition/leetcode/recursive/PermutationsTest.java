package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PermutationsTest {

    private Permutations permutations;

    private List<List<Integer>> permutationList = asList(
            asList(1, 2, 3, 4), asList(1, 2, 4, 3), asList(1, 3, 2, 4), asList(1, 3, 4, 2),
            asList(1, 4, 2, 3), asList(1, 4, 3, 2), asList(2, 1, 3, 4), asList(2, 1, 4, 3),
            asList(2, 3, 1, 4), asList(2, 3, 4, 1), asList(2, 4, 1, 3), asList(2, 4, 3, 1),
            asList(3, 1, 2, 4), asList(3, 1, 4, 2), asList(3, 2, 1, 4), asList(3, 2, 4, 1),
            asList(3, 4, 1, 2), asList(3, 4, 2, 1), asList(4, 1, 2, 3), asList(4, 1, 3, 2),
            asList(4, 2, 1, 3), asList(4, 2, 3, 1), asList(4, 3, 1, 2), asList(4, 3, 2, 1)
    );

    @Before
    public void before() {
        permutations = new Permutations();
    }

    @Test
    public void testPermutation() {
        assertNotNull(permutations);
        List<Integer> nums = asList(1, 2, 3, 4);
        assertEquals(permutationList, permutations.permute(nums, new ArrayList<>(), nums.size()));
    }

    @Test
    public void testPermutation2() {
        List<Integer> nums = asList(1, 2, 3, 4);
        assertEquals(permutationList, permutations.permute(nums));
    }

    @After
    public void after() {
        permutations = null;
    }
}