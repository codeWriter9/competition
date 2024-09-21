package org.competition.leetcode.binarysearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestLetterBiggerTargetTest {

    private SmallestLetterBiggerTarget smallestLetterBiggerTarget;

    @Before
    public void setUp() {
        smallestLetterBiggerTarget = new SmallestLetterBiggerTarget();
    }

    @Test
    public void testNextGreatestLetter() {
        assertEquals('c', smallestLetterBiggerTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        assertEquals('f', smallestLetterBiggerTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        assertEquals('x', smallestLetterBiggerTarget.nextGreatestLetter(new char[]{'x','x','y','y'}, 'z'));
    }

    @After
    public void tearDown() {
        smallestLetterBiggerTarget = null;
    }
}
