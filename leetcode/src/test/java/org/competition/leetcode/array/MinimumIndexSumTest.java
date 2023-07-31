package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class MinimumIndexSumTest {

    private MinimumIndexSum minimumIndexSum;

    @Before
    public void before() {
        minimumIndexSum = new MinimumIndexSum();
    }

    @Test
    public void testMinimumIndexSum() {
        assertNotNull(minimumIndexSum);
        assertArrayEquals(new String[]{"Shogun"}, minimumIndexSum.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
        assertArrayEquals(new String[]{"Shogun"}, minimumIndexSum.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"}));
        assertArrayEquals(new String[]{"happy", "sad"}, minimumIndexSum.findRestaurant(new String[]{"happy", "sad", "good"}, new String[]{"sad", "happy", "good"}));
    }

    @After
    public void after() {
        minimumIndexSum = null;
    }
}
