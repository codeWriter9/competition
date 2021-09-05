package org.competition.leetcode.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameTest {

    private JumpGame jumpGame;

    @Before
    public void before() {
        jumpGame = new JumpGame();
    }

    @Test
    public void testJumpGame() {
        assertNotNull(jumpGame);
        assertTrue(jumpGame.canJump(new int[]{0}));
        assertTrue(jumpGame.canJump(new int[]{1}));
        assertTrue(jumpGame.canJump(new int[]{1,1}));
        assertFalse(jumpGame.canJump(new int[]{0,1}));
        assertFalse(jumpGame.canJump(new int[]{1,0,1}));
        assertTrue(jumpGame.canJump(new int[]{2,0,1}));
        assertTrue(jumpGame.canJump(new int[]{2,3,1,1,4}));
        assertFalse(jumpGame.canJump(new int[]{3,2,1,0,4}));
        assertTrue(jumpGame.canJump(new int[]{3,2,2,0,1}));
        assertFalse(jumpGame.canJump(new int[]{3,2,1,0,0}));
    }

    @After
    public void after() {
        jumpGame = null;
    }

}
