package org.competition.leetcode.recursive;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class KPermutationsTest {

    private KPermutations kPermutations;

    @Before
    public void setUp() {
        kPermutations = new KPermutations();
    }

    @Test
    public void test() {
        assertNotNull(kPermutations);
        Assert.assertEquals(6, kPermutations.permute(new int[]{1, 2, 3}, 2).size());
        Assert.assertEquals(6, kPermutations.permute(new int[]{1, 2, 3}, 3).size());
        Assert.assertEquals(3, kPermutations.permute(new int[]{1, 2, 3}, 1).size());
    }

    @After
    public void destroy() {
        kPermutations = null;
    }
}
