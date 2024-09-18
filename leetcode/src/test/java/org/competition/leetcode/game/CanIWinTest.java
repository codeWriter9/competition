package org.competition.leetcode.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanIWinTest {

    private CanIWin canIWin;

    @Before
    public void setUp() {
        canIWin = new CanIWin();
    }

    /**
     *
     * Please check the DP solution for this problem <link>../dp/CanIWinTest.java<link/>
     *
     */
    @Test
    public void testCanIWin() {
//        assertFalse(canIWin.canIWin(10, 11));
//        assertTrue(canIWin.canIWin(10, 0));
//        assertTrue(canIWin.canIWin(10, 1));
//        assertTrue(canIWin.canIWin(4, 6));
    }

    @After
    public void tearDown() {
        canIWin = null;
    }
}
