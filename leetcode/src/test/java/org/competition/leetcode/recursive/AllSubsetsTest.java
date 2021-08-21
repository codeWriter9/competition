package org.competition.leetcode.recursive;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;

public class AllSubsetsTest extends TestCase {

    private AllSubsets allSubsets;

    public AllSubsetsTest(String name) {
        super(name);
        allSubsets = new AllSubsets();
    }

    public static Test suite() {
        return new TestSuite(AllSubsetsTest.class);
    }


    public void testSubset() {
        Assert.assertNotNull(allSubsets);
        List<List<Integer>> subsets = new ArrayList();
        List<Integer> nums = Arrays.asList(1, 2, 3);
        allSubsets.findSubsets(subsets, nums, new ArrayList<>(), 0);
        Assert.assertEquals((int)pow(2, nums.size()), subsets.size());
    }

    public void testSubset2() {
        Assert.assertNotNull(allSubsets);
        List<List<Integer>> subsets = new ArrayList();
        List<Integer> nums = Arrays.asList(1, 2, 3 ,4);
        allSubsets.findSubsets(subsets, nums, new ArrayList<>(), 0);
        Assert.assertEquals((int)pow(2, nums.size()), subsets.size());
    }
}