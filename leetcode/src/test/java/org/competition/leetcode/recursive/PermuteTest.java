package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class PermuteTest {

    private Permute permute;

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
        permute = new Permute();
    }

    @Test
    public void test() {
        assertNotNull(permute);
        int[] nums = new int[]{1, 2, 3, 4};
        assertEquals(permutationList, permute.permutations(nums));

        nums = new int[]{1, 2, 3};
        permute.nextPermutation(nums);
        assertArrayEquals(nums, new int[]{1, 3, 2});

        nums = new int[]{3, 2, 1};
        permute.nextPermutation(nums);
        assertArrayEquals(nums, new int[]{1, 2, 3});

        nums = new int[]{1, 1, 5};
        permute.nextPermutation(nums);
        assertArrayEquals(nums, new int[]{1, 5, 1});
    }

    @After
    public void after() {
        permute = null;
    }
}
