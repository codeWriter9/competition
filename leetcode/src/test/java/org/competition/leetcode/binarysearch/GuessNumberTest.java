package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {

    private GuessNumber guessNumber;

    @Before
    public void setUp() {
        guessNumber = getGuessNumber(6);
    }

    private GuessNumber getGuessNumber(final int number) {
        return new GuessNumber() {

            @Override
            public int guess(int num) {
                if(num == number) return 0;
                else return num > number ? -1 : 1;
            }
        };
    }

    @Test
    public void testGuessNumber() {
        assertEquals(6, guessNumber.guessNumber(10));
        assertEquals(1, getGuessNumber(1).guessNumber(1));
        assertEquals(1, getGuessNumber(1).guessNumber(2));


    }

    @After
    public void tearDown() {
        guessNumber = null;
    }
}
