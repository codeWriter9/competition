package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CanIWinTest {

    private CanIWin canIWin;

    @Before
    public void setUp()  {
        canIWin = new CanIWin();
    }

    @Test
    public void test() {
        assertNotNull(canIWin);
        assertTrue(canIWin.canIWin( 10, 0));
        assertTrue(canIWin.canIWin(10, 1));
        assertFalse(canIWin.canIWin(10, 11));
        assertTrue(canIWin.canIWin(10, 15));
        assertTrue(canIWin.canIWin(19, 190));
        assertFalse(canIWin.canIWin(20, 152));
    }

    @After
    public void tearDown() {
        canIWin = null;
    }
}
