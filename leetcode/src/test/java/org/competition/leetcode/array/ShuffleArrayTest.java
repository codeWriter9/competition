package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

public class ShuffleArrayTest {

    private ShuffleArray shuffleArray;

    @Before
    public void before() {
    }

    @Test
    public void testShuffleArrayNotNull() {
        shuffleArray = new ShuffleArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        assertNotNull(shuffleArray);
    }

    @Test
    public void testShuffleArray() {
        shuffleArray = new ShuffleArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        int length = 10;
        while(length > 0) {
            System.out.println(Arrays.toString(shuffleArray.shuffle()));
            length--;
        }
        System.out.println(Arrays.toString(shuffleArray.reset()));
    }

    @After
    public void after() {
        shuffleArray = null;
    }
}