package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlowerBedTest {

    private FlowerBed flowerBed;

    @Before
    public void before() {
        flowerBed = new FlowerBed();
    }

    @Test
    public void testFlowerBed() {
        assertNotNull(flowerBed);
        assertTrue(flowerBed.canPlaceFlowers(new int[]{0}, 1));
        assertFalse(flowerBed.canPlaceFlowers(new int[]{1}, 1));
        assertTrue(flowerBed.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        assertFalse(flowerBed.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        assertFalse(flowerBed.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
        assertTrue(flowerBed.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
    }

    @After
    public void after() {
        flowerBed = null;
    }
}
