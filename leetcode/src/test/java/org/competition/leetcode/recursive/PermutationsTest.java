package org.competition.leetcode.recursive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTest extends TestCase {

    private Permutations permutations;

    public PermutationsTest(String name) {
        super(name);
        permutations = new Permutations();
    }

    public static Test suite() {
        return new TestSuite(PermutationsTest.class);
    }

    public void testPermutation() {
        Assert.assertNotNull(permutations);
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<List<Integer>> permutationList = permutations.permute(nums, new ArrayList<>(), nums.size());
        System.out.println(permutationList);
    }

    public void testReverseList() {

    }
}